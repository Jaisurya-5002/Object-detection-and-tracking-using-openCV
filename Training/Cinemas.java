import java.util.*;
public class Cinemas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] seats=new int[n];
        for(int i=0;i<n;i++){
            seats[i]=sc.nextInt();
        } 
        boolean left=true;
        boolean right=true;
        int count=0;
        for(int i=0;i<n;i++){
            if(seats[i]==0){
                boolean leftSafe=(i==0)||(seats[i-1]==0);
                boolean rightSafe=(i==n-1)||(seats[i+1]==0);
                if(leftSafe&& rightSafe){
                    seats[i]=1;
                    count++;
                     
                }
            }
        }
        System.out.println(count);
    }
    
}
