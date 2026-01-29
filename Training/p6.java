import java.util.*;
public class p6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        String s= n;
        String s4=n+n;
        String s5=n+n+n;  
        int total=Integer.parseInt(s)+Integer.parseInt(s4)+Integer.parseInt(s5);
        System.out.println(total);
    }
    
}
