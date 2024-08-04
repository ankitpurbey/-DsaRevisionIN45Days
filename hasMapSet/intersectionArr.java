package hasMapSet;

import java.util.HashSet;

public class intersectionArr {
    public static int commonNumber(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        int count =0;
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            if(hs.contains(arr2[j])){
                count++;
                hs.remove(arr2[j]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5,6,7,8,9};
        int arr2[] ={4,5,6,7,8,9,10,11,12};
        System.out.println(commonNumber(arr1, arr2)); 
    }
}
