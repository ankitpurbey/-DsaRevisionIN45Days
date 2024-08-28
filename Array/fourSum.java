/**
 * fourSum
 */
import java.util.ArrayList;
import java .util.Arrays;
public class fourSum {
    public static ArrayList<Integer> sumOfFor(int arr[], int target){
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length-4; i++){
            if(arr[i] + arr[i+1] +arr[i+2] +arr[i+3] +arr[i+4] ==target){
                result.add(i);
                result.add(i+1);
                result.add(i+2);
                result.add(i+3);
            }
    }
    return result;
}

    public static void main(String[] args) {
        int arr[] ={1,0,-1,0,-2,2};
        int target =0;
        System.out.println(sumOfFor(arr, target));
    }
}