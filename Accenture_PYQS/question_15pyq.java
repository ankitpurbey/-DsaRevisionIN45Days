package Accenture_PYQS;
import java.util.*;
/**
 * question_15pyq
 */
public class question_15pyq {
    public static int evenOdd(int n, int arr[],int s1, int s2){
        int sum =0;
        //int s1,s2;
        int evenArr[] = new int[n/2+1];
        int oddArr[] = new int[n/2+1];
        for(int i=0; i<=arr.length; i++){
            if(i ==0 || i%2==0){
                evenArr[i] = arr[i];
            }
            else{
                oddArr[i] = arr[i];
            }
        }

         Arrays.sort(evenArr);
         Arrays.sort(oddArr);
        
         for(int i=0; i<evenArr.length; i++){
             s1 = evenArr[evenArr.length-1];
         }

         for(int i=0; i<oddArr.length; i++){
             s2 = oddArr[oddArr.length-1];
         }

         return sum = s1 + s2;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(evenOdd(n, arr, n, n));
    }
}