package RepeatedQuestions;
import java.util.Scanner;
public class evenOddIndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n  = sc.nextInt();
        int []arr = new int[n];


        int oddIndex =0;
        int evenIndex =0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(i%2==0){
                evenIndex += arr[i];
                
            }
            else{
                oddIndex+= arr[i];
                
            }
        }
        System.out.println("Sum of even index is:" + evenIndex);
        System.out.println("Sum of odd index is:" + oddIndex);
        
    }
}
