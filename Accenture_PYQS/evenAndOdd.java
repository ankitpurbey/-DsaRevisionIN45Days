package Accenture_PYQS;

public class evenAndOdd {
    public static int digitProd(int n){
        int product =1;
        while(n!=0){
            product =product*(n%10);
            n=n/10;
        }
        return product;
    }
    public static int digitSum(int n){
        int sum =1;
        while(n!=0){
            sum +=sum*(n%10);
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n =12;
        if(n%2 ==0){
            System.out.println(digitSum(n));
        }else{
            System.out.println(digitProd(n));
        }
        
    }
}
