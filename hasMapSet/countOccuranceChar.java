package hasMapSet;

import java.util.HashMap;

public class countOccuranceChar {
    public static void main(String[] args) {
        countChar("Test Automation java");
    }
    public static void countChar(String s){
        HashMap<String, Integer> map = new HashMap<>();
        for(String c : s.split(" ")){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }

        }
        System.out.println(map);
    }
}
