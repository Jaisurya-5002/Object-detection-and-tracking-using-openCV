import java.util.*;
public class code1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> times = new ArrayList<>();
        String[] input = sc.nextLine().split(" ");
        for (String s : input) times.add(Integer.parseInt(s));
        int total = sc.nextInt();
        if (times.size() != 8) {
            System.out.println("disqualified");
            return;
        }
        int[] limit = {5, 5, 10, 10, 15, 15, 20, 20};
        for (int i = 0; i < 8; i++) {
            if (times.get(i) > limit[i]) {
                System.out.println("disqualified");
                return;
            }
        }
        if (total > 120) {
            System.out.println("disqualified");
        } else {
            System.out.println("qualified");
        }
    }
}
