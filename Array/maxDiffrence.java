public class maxDiffrence {
    public static int findMaxDiff(int arr[]){
        int val =0;
        int n = arr.length;
        if(n<2){
            return 0;
        }
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1] - arr[i];
            val = Math.max(val, arr[i]);
        }
        return val;
    }
    public static void main(String[] args) {
        int arr[] ={3,6,9,1};
        System.out.println(findMaxDiff(arr));
    }
}
