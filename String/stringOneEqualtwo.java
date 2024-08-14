package String;

import java.util.HashSet;

public class stringOneEqualtwo {
    public static int countChangedStr(String str, String str2){
        HashSet<Character> hs = new HashSet<>();
        int count =0;
        for(int i=0; i<str2.length(); i++){
            hs.add(str2.charAt(i));
        }
        for(int i=0; i<str.length(); i++){
            if(!hs.contains(str.charAt(i))){
               count++;
            }
           
        }
        return count;
    }
    public static void main(String[] args) {
        String str ="ABD";
        String str2 ="AABCCAD";
        System.out.println(countChangedStr(str, str2));
    }
}
