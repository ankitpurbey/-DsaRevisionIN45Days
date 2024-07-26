import java.util.Arrays;
public class intersectionArray {
    public static int []intersection(int arr1[], int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int nums[] = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] ==arr2[j]){
                    nums[j] =arr1[i];
                }
        }
    }
    return nums;
    }
    public static void main(String[] args) {
        int arr1[]={1,2 ,3 ,4 ,5 ,6};
        int arr2[]={4,5,6,7,8,9};
        System.out.println(intersection(arr1, arr2));
    }
}
