import java.util.*;
public class Star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sen=sc.next();
        String[] words=sen.split(" ");
        String word=func(words);
        System.out.println(word);
    }
    public static String func(String[] words){
        int n=words.length;
        String res="";
        int maxVowels=0;
        for(String string:words){
            
            String t=string.replaceAll("[^aeiouAEIOU]","");
            int nVowels=string.length()-t.length();
            System.out.println(string+" "+nVowels);
            if(nVowels>maxVowels){
                maxVowels=nVowels;
                res=string;
            }
        }
        return res;
    }
}
