public class missingElement {
    public static int missingNumber(int arr[]){
        int n = arr.length+1;
        int count =0;
         n = (n)*(n+1)/2;
         for(int i = 0; i < arr.length; i++){
            count+=arr[i];
         }
         return n-count;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,6,7,8};
        System.out.println("The missing number is "+missingNumber(arr));
    }
}
