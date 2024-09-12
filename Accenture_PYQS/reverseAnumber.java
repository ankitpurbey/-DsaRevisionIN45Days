public class reverseAnumber {
    public static void main(String[] args) {
        int n =12345;
        int reverse =0;
        while(n!=0){
            int temp = n%10;
            reverse = reverse*10 +temp;
            n =n/10;
        }
        System.out.println(reverse);
    }
}
