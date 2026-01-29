import java.util.*;
public class Ascii{
    public static void main(String[] args) {
        String str = "Hello world";
        char[] ch = str.toCharArray();
        char[] res = new char[ch.length];
        for(int i=0;i<ch.length;i++){
            char chr = ch[i];
            if(chr>='a' && chr<='z'){
                res[i]=(char)(219 - (int) ch[i]);
            }
            else{
                res[i]=chr;
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(res[i]);
        }
    }
}