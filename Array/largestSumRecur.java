public class largestSumRecur {
    public static int getMax(int arr[], int i){
        if(i>=arr.length){
            return 0;
        }
        int x = arr[i] + getMax(arr, i+2);
        int y = getMax(arr, i+1);
        return Math.max(x, y);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,6};
        System.out.println(getMax(arr, 0));
        
    }
}
