package hasMapSet;

import java.util.HashMap;

/**
 * countChar
 */
public class countChar {

    public static int countFreq(String s){
        char c[] = s.toCharArray();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            if(map.containsKey(c[i])){
                map.put(c[i], map.get(c)+1);
            }
            
        }
    }
    public static void main(String[] args) {
        String s = "Ankit";
    }
}