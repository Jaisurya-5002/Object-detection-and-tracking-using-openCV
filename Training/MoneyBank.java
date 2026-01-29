import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Carprice=sc.nextInt();
        int Savings=sc.nextInt();
        int required_mny=Carprice-Savings;
        int start_value=sc.nextInt();
        int sum=0;
        int count=0;
        while(sum<required_mny){
            for(int i=start_value;i<start_value+7;i++){
                sum+=i;
                count++;
                if(sum>=required_mny) break;
            }
            start_value++;k          
        }
        System.out.println(count);
        System.out.println(sum+Savings);
        sc.close();
    }
}
