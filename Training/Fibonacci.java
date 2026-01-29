import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n0=0,n1=1,n3;
        int count=sc.nextInt();
        System.out.print(n0+" "+n1+" ");
        for(int i=0;i<count;i++){
            n3=n0+n1;
            
            n0=n1;
            n1=n3;
            if(n3>10){
                int temp=n3;
                n3=0;
                while(temp>0){
                    int rem=temp%10;
                    n3=n3*10+rem;
                    temp=temp/10;
                }
            }
            System.out.print(n3+" ");
        }
    }
    
}
