package Accenture_PYQS;

import java.util.Scanner;

public class sumOfAllInRange {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count1 =0;
		int count2 =0;
		for(int i =1; i<=m; i++){
		    if(i%n ==0){
		        count1 = count1+i;
		    }
		    else{
		        count2 = count2+i;
		    }
		    }
		    if(count2 > count1){
		    System.out.print(count2 - count1);
		}
		else{
		    System.out.print(count1 - count2);
		    
		}
}
}
