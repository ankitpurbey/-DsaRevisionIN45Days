package Accenture_PYQS;

/**
 * oddEven16August
 */
public class oddEven16August {
    public static String returnOddEven(int arr[]){
        String str ="";
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 ==0){
                str += "odd";
            }
            else{
                str+= "even";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,6,7};
        System.out.println(returnOddEven(arr));
    }
}