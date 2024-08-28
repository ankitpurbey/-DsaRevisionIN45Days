package Accenture_PYQS;

public class findNonNegativeMiddle {
    public static int findMiddleElement(int arr[]){
        int n = arr.length;
        int middle =0;
        int newArr[] = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                newArr[i] = arr[i];
            }
        }
        for(int i=0; i<newArr.length; i++){
            if(newArr.length%2 ==0){
                middle = Math.min(newArr[newArr.length/2], newArr[newArr.length/2 +1]);
            }
            else{
                middle = newArr[newArr.length/2 +1];
            }
        }
        return middle;
    }
    public static void main(String[] args) {
        int arr[] ={1,-2,3,-4,5,6};
        System.out.println(findMiddleElement(arr));
    }
}
