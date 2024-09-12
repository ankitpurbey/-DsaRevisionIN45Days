package RepeatedQuestions;

import java.util.Scanner;
public class missingNUmber {
    public static int findMissing(int arr[] ,int n){
        int missing  = n*(n+1)/2;
        int count =0;
        for(int i=0; i<n; i++){
            count += arr[i];
        }
        return missing -count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] ={3,0,1};
        System.out.println(findMissing(arr, n));
    }
}
