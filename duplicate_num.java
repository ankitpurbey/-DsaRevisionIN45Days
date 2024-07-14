import java.util.Arrays;

/**
 * duplicate_num
 */
public class duplicate_num {
    public  static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                count =nums[i];
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        int nums[] ={1,2,5,2,6,7};
        System.out.println(findDuplicate(nums));
    }
}