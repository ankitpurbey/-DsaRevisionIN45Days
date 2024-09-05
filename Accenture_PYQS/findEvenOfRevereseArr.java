/**
 * findEvenOfRevereseArr
 */

public class findEvenOfRevereseArr {
    public static int findSumOfEven(int arr[]){
        int sum =0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int ridx = n-i-1;
            if(ridx%2==0){
                sum +=arr[i];
            }
        }
        return sum;
    }
public static void main(String[] args) {
    int arr[] ={1,2,3,4,1,2,0,1,2,3};
    System.out.println(findSumOfEven(arr));
}
    
}