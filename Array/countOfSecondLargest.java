public class countOfSecondLargest {
    public static  int countSecondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]>largest2 && arr[i]<largest){
                largest2 = arr[i];
            }
            
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == largest2){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,4,5};
        System.out.println(countSecondLargest(arr));

    }
}
