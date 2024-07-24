public class largestSmNoADjc {
    public static  int largestSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+2; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
            if(arr.length <=2){
                if(arr[i] >arr[i+1]){
                    return arr[i];

                    }
                    else{
                        return arr[i+1];
                    }
    
            }
            
    }
        return maxSum;

       }
    public static void main(String[] args) {
        int arr[] ={4};
        System.out.println(largestSum(arr));
    }
}
