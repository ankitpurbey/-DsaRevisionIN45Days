public class equilibriumPoint {
    public static int equilibriumIndex(int arr[]){
        int n = arr.length;
        int suffix[] =new int[n];
        int prefix[] = new int[n];
        prefix[0] = suffix[0];
        prefix[n-1] = suffix[n-1];


        for(int i=1; i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
            suffix[n-i-1] = arr[n-i-1] + suffix[n-i];
            
        }
        for(int i=0; i<n; i++){
            if(suffix[i] ==prefix[i]){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] ={-7,1,5,2,-4,3,0};
        System.out.println(equilibriumIndex(arr));
    }
}
