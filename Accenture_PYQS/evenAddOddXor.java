package Accenture_PYQS;
public class evenAddOddXor {
    public static int evenAndOddIndex(int arr[]){
        int result =0;
        int xor =0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                result += arr[i];
            }
            else{
                xor = xor ^ arr[i];
            }
        }
        return result+xor;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,4,2,1};
        System.out.println(evenAndOddIndex(arr));
    }
}
