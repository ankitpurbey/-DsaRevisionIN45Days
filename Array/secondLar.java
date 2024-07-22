package Array;

import java.util.Scanner;

public class secondLar {
    public static int secLarge(int arr[], int n){
        int max = Integer.MIN_VALUE;
    int max2 =7 ;
    for(int i=0; i<n; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]> max2 && arr[i]<max){
            max2 = arr[i];
        }
    }
        return max2;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.print(secLarge(arr, n));
    }
}

