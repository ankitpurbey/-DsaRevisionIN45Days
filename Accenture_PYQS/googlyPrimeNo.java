package Accenture_PYQS;

public class googlyPrimeNo {
    public static String checkString(int n){
        int sum =0;
        while(n>0){
            int r = n%10;
            sum += r;
            n = n/10;
        }
        boolean isPrime = true;
        for(int i=2; i<sum; i++){
            if(sum%i ==0){
                isPrime =false;
                break;
            }
        }
        return isPrime? "true" : "false";
    }
    
    public static void main(String[] args) {
        int n =43;
        System.out.println(checkString(n));
    }
}
