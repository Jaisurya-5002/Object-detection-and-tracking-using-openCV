import java.util.*;
public class MaxiMinnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[] ch1=Integer.toString(n).toCharArray();
        char[] ch2=Integer.toString(m).toCharArray();
        Arrays.sort(ch2);
        StringBuilder sb=new StringBuilder(new String(ch2)).reverse();
        char[] ch3=sb.toString().toCharArray();
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch3.length;j++){
                if(ch1[i]<ch3[j]){
                    ch1[i]=ch3[j];
                    ch3[j]=0;
                }
            }
        }
        for(char c : ch1){
            System.out.print(c);
        }
    }
    
}
