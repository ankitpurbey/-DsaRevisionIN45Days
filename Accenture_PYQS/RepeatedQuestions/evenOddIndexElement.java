package RepeatedQuestions;

public class evenOddIndexElement {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int oddIndex =0;
        int evenIndex =0;
        for(int i=0; i<arr.length; i++){
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
