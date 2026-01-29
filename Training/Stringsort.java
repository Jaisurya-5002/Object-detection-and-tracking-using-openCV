import java.util.*;
public class Stringsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="Jai";
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        for(char val: ch){ 
            System.out.print(val);
        }
    }
    
}
