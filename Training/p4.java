import java.util.*;
public class p4 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no.of days: ");
         int num=sc.nextInt();
         int yrs=num/365;
         int actyrs=yrs*365;
         int weeks=num-actyrs;
         int actweeks=weeks/7;
         int actwks=actweeks*7;
         int days=weeks-actwks;
         System.out.println("years: "+ actyrs);
         System.out.println("weeks: "+ actweeks);
         System.out.println("days: "+ days);
    }
    
}
