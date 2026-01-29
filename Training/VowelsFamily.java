import java.util.*;
public class VowelsFamily {
    public static void main(String[] args) {
        String[] arr = {"semantic", "aimless", "beautiful", "meatless icecream"};
        System.out.println(VowelsFamily.matchVowels(arr));        
    }
    public static List<String> matchVowels(String[] arr){
        Set<Character> first = new HashSet<>();
        for(int i=0;i<arr[0].length();i++){
            if("aeiou".indexOf(arr[0].charAt(i)) >=0){
                first.add(arr[0].charAt(i));
            }
        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Set<Character> val = new HashSet<>();
            for(int j=0;j<arr[i].length();j++){
                if("aeiou".indexOf(arr[i].charAt(j)) >=0){
                    val.add(arr[i].charAt(j));
                }                
            }
            if(val.equals(first)){
                list.add(arr[i]);
            }
        }
        return list;
    }
}