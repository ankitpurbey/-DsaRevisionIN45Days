package Accenture_PYQS;

import java.util.Scanner;

/**
 * AugShiftQue
 */
public class AugShiftQue {
    public static int stockNegativeReaturnDay(int n, int arr[]){
        int count =0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        //test case 1
        
        
        //int arr[]=  {5,6,4,5,2,3,4};
        //test case 2
        int arr[] ={5,4,3,2,1};
        System.out.println(stockNegativeReaturnDay(n, arr));

    }
}