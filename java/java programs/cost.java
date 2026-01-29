import java.util.Scanner;
public class cost {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char c : s1.toCharArray()){
            arr1[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            arr2[c-'a']++;
        }
        int nAdds=0;
        for(int i=0;i<26;i++){
            if(arr1[i]>arr2[i]){
                nAdds+=arr1[i]-arr2[i];
            }
        }
        System.out.println(nAdds);
    }
    
}
