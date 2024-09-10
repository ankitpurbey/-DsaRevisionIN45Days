public class findTargetPair {
    public static int[] findTraget(int arr[], int target){
        int n = arr.length;
        int newArr[] = new int[2];
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n-1; j++){
                if(arr[i] + arr[j] ==target && arr[i] > arr[j]){
                    newArr[i] = arr[i];
                }
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] ={11,1,2,8,10,11,15,7};
        int target =18;
    }
}
