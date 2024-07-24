package Recursion;
import java.util.Scanner;
/**
 * printNumNto0
 */
public class printNumNto0 {
    public static void isPrime(int n){
        if(n==0){
            return;
        }
        
        System.out.println(n);
        isPrime(n-1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        isPrime(n);
    }
}
