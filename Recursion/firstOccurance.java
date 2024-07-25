package Recursion;
import java.util.Arrays;

public class firstOccurance {
        public static int firstOccurance(int arr[], int k, int i){
            if(i==arr.length){
                return -1;  
            }
            if(arr[i]==k){
                return i;
            }
             return firstOccurance(arr, k, i+1);
        }
    public static void main(String[] args){

        int arr[] ={1,2,5,8,3,9};
        int k =1;
        int i =0;
        System.out.println(firstOccurance(arr, k, i));
    }
}
