package Accenture_PYQS;

import java.util.Scanner;

public class ratQ {
    public static int calculateFood(int n,int unit, int arr[], int r){
        if(n==0){
            return -1;
        }
        int food =6;
        int reqiredFood = r*unit;
        for(int i=0; i< n; i++){
            food+=arr[i];
        }
		return food;

	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int r = sc.nextInt();
		int unit = sc.nextInt();
		
	    System.out.print(calculateFood(n,unit,arr,r));
		
}
}
    

