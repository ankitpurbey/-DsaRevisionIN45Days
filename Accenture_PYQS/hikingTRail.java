package Accenture_PYQS;
import java.util.*;
public class hikingTRail {
    public static int hikinPoint(int n, int arr[]){
       
        int peekPoint =0;
        
        for(int i=0;i<n-1; i++){

            if(n<=2){
            return Math.max(arr[i], arr[i+1]);
            }
            if(arr[i] > arr[i+1]){
                peekPoint =arr[i];
            }
            
        }
        return peekPoint;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        int arr[] = {1,2,3,4,3,2,1};
        int n = arr.length;
        System.out.println(hikinPoint(n, arr));

    }
}
