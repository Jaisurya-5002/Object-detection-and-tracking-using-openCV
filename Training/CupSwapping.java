import java.util.*;
public class CupSwapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char ballposition = 'B';
        for (int i=0;i<n;i++){
            String swap=sc.nextLine().trim().toUpperCase();
            char a=swap.charAt(0);
            char b=swap.charAt(1);
            if(ballposition==a) {
                ballposition=b;
            }
            else if(ballposition==b){
                ballposition = a;
            }
        }
        System.out.println(ballposition);
    }
}
