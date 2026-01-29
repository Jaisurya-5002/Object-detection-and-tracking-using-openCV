import java.util.*;

public class Frogjump {

    public static int minjumps(int n, int[] stones) {
        int[] arr = new int[n];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == Integer.MAX_VALUE) continue;
            int jump = stones[i];
            int forward = i + jump;
            if (forward < n) {
                arr[forward] = Math.min(arr[forward], arr[i] + 1);
            } else {
                return arr[i] + 1;
            }
            int backward = i - jump;
            if (backward >= 0) {
                arr[backward] = Math.min(arr[backward], arr[i] + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != Integer.MAX_VALUE && i + stones[i] >= n) {
                return arr[i] + 1;
            }
        }
        return -1;
    } ``
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }
        System.out.println(minjumps(n, stones));
        sc.close();
    }
}
