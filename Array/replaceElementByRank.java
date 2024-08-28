import java.util.HashSet;

public class replaceElementByRank {
    public static int findRank(int arr[]){
        int rank =0;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    s.add(arr[j]);
                }
            }
        }
        rank =s.size()+1;
        return rank;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,6,4,9,5};
        System.out.println(findRank(arr));
    }
}
