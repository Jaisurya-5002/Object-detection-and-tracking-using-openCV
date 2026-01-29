import java.util.*;
class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="engineering";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for(char c :map.keySet()){
            System.out.println(c+" "+map.get(c));
        }
    }
}  