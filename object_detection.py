import cv2

# Choose your preferred tracker: 'csrt', 'kcf', 'mosse', etc.
TRACKER_TYPE = 'csrt'

# Create the tracker object based on selection
def create_tracker(tracker_type):
    if tracker_type == 'csrt':
        return cv2.TrackerCSRT_create()
    if tracker_type == 'kcf':
        return cv2.TrackerKCF_create()
    if tracker_type == 'mosse':
        return cv2.TrackerMOSSE_create()
    raise ValueError("Unsupported tracker type")

# Initialize video capture (from webcam)
cap = cv2.VideoCapture(0)

# Read first frame
ret, frame = cap.read()
if not ret:
    print("Failed to capture video")
    cap.release()
    exit()

# Allow user to select the ROI (Region of Interest) for tracking
bbox = cv2.selectROI("Select Object to Track", frame, False)
cv2.destroyWindow("Select Object to Track")

# Initialize tracker with first frame and selected bounding box
tracker = create_tracker(TRACKER_TYPE)
tracker.init(frame, bbox)

while True:
    ret, frame = cap.read()
    if not ret:
        break
    

    # Update tracker and get updated position
    success, bbox = tracker.update(frame)

    if success:
        # Draw bounding box
        x, y, w, h = [int(v) for v in bbox]
        cv2.rectangle(frame, (x, y), (x + w, y + h), (0, 255, 0), 2)
        cv2.putText(frame, f"{TRACKER_TYPE.upper()} Tracker", (x, y - 10),
                    cv2.FONT_HERSHEY_SIMPLEX, 0.6, (0, 255, 0), 2)
    else:
        # Tracking failure: notify user
        cv2.putText(frame, "Tracking failure detected", (10, 30),
                    cv2.FONT_HERSHEY_SIMPLEX, 0.8, (0, 0, 255), 2)

    cv2.imshow("Object Tracking", frame)

    # Exit on 'q' key
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()