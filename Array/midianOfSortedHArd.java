import java.util.Arrays;

/**
 * midianOfSortedHArd
 */
public class midianOfSortedHArd {
    
    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,j;
        int ans [] = new int [nums1.length +nums2.length];
        for( i=0 ; i< nums1.length; i++){
            ans[i] = nums1[i];
        }
        for( j =0; j<nums2.length; j++){
            ans[i+j] = nums2[j];
        }
        Arrays.sort(ans);
        double mid ;
        if(ans.length%2==0){
            mid = (ans[ans.length/2-1] + ans[ans.length/2])/2.0;
        }
        else{
            mid = ans[ans.length/2];
        }
        return mid;
}


    public static void main(String[] args) {
        int nums1[]={1,2,3};
        int nums2[]={4,5,6};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}