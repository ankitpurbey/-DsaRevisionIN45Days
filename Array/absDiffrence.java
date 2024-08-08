import java.util.Scanner;

public class absDiffrence {
    public static int absoluteDiff(int arr[],int n , int num, int diff) {
        int count =0;
        if(num<=diff){
            return 0;
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i]-num <=diff){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int num = sc.nextInt();
        int diff = sc.nextInt();
        System.out.println(absoluteDiff(arr, n, num, diff));
    }
}
