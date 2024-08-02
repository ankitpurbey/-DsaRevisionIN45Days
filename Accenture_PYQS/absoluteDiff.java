package Accenture_PYQS;

import java.util.Scanner;

public class absoluteDiff {
    public static int countDiff(int arr[], int num, int diff){
        int count =0;
        if(num<=diff){
            return 0;
        }
        for(int i=0; i< arr.length; i++){
            if( arr[i] -num <=diff ){
                count++;
            }
        }
        return count;
    }
   

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int num = sc.nextInt();
		int diff = sc.nextInt();
		for(int i=0; i< n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.print(countDiff(arr,num,diff));
		
}
}
