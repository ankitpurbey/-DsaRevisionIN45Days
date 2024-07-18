package Array;

public class twoSumMediumLevel {
    public static int [] twoSum(int numbers[], int target){
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]==numbers[j]){
                    return new int[]{i, j};
                }
            }
        }
            return new int[]{};
    }
    public static void main(String[] args) {
        int numbers[] ={2,7,11,15};
        int target = 9;
        System.out.println(twoSum(numbers, target));
    }
}
