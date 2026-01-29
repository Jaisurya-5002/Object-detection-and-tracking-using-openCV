import java.util.*;
public class Sumofsquares {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of terms: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(Math.pow(i,2));
        }   
    }
    
}
