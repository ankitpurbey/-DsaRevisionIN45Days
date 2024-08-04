package hasMapSet;

import java.util.HashSet;

public class unionArr {
    public static int unionOfArr(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i< arr2.length; i++){
            hs.add(arr2[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int arr1[] ={1,2,4,5};
        int arr2[] ={3,6,7,9,2};
        System.out.println(unionOfArr(arr1, arr2));
    }
}
/// time complexity will o(n) times