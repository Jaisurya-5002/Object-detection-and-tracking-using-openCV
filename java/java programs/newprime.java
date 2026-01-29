import java.util.Scanner;
public class newprime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={4,5,6,7,9,9,3};
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
