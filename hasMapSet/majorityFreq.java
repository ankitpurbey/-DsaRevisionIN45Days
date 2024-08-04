package hasMapSet;
import java.util.HashMap;

public class majorityFreq {

    

/**
 * MajorityFreq
 */
//package HashMap
    public static void countFreq(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int N =arr.length;
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put((arr[i]), map.get(arr[i]+1));
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > N/3){
                System.out.println("Majority element is " + key);
                
            }
            else{
                System.out.println(0);
            }
        }

    }

    public static void main(String[] args) {
        int n = 9;
        int arr[] ={1,2,4,5,6,1,1,3,1};
        countFreq(arr);
    }
}
