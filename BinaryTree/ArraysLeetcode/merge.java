package BinaryTree.ArraysLeetcode;

public class merge {
    public static void mergeArr(int nums1[], int nums2[], int n, int m){
        int count =0;
        for(int i=m; i<nums1.length; i++){
            nums1[i] = nums2[count];
            count++;
    }
}
    public static void main(String[] args) {
        int nums1[] ={1,2,3};
        int nums2[] ={2,5,6};
        int m =nums1.length;
        int n = nums2.length;
        mergeArr(nums1, nums2, n, m);
    }
}

