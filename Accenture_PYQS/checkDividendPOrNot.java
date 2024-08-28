package Accenture_PYQS;

public class checkDividendPOrNot {
    public static int fidIndexOfDividend(int arr[], int diivsor, int q, int r){
        int dividend = q*diivsor+r;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == dividend){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8};
        int diivsor =1;
        int q =2;
        int r =0;
        System.out.println(fidIndexOfDividend(arr, diivsor, q, r));
    }
}
