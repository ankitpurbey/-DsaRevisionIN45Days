package hasMapSet;

import java.util.HashMap;
import java.util.HashSet;

/**
 * countChar
 */
public class countChar {

    public static int countFreq(String s){
        char charArr[] = s.toCharArray();
        HashMap<String,Integer> map = new HashMap<>();
        for (char c : charArr) {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            
        }
        HashSet<Character> charString = map.keySet();
        for(Character c : map.keySet()){
            if(map.get(c) > 1){
                System.out.println(map.get(c));
            }
        }
    }
    public static void main(String[] args) {
        String s = "Ankit";
        countFreq(s);
    }
}