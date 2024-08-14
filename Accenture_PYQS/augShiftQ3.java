package Accenture_PYQS;

public class augShiftQ3 {
    public static int countMultipleOfThree(int arr[]){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%3 ==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={12,21,3,4}; // output 3

        //testCase 2
        // int arr[] = {1,2}  // output 0
        System.out.println(countMultipleOfThree(arr));

    }
}
