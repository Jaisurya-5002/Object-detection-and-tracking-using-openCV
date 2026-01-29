import java.util.*;
public class Linearsearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n-1;i++){
            if(arr[i]==target){
                System.out.print("The element "+target+" found at index "+i);
                break;
            }
        }
    }
    
}
