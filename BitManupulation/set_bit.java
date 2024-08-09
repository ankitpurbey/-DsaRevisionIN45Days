package BitManupulation;
import java.util.Scanner;

public class set_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<< pos;

        if((bitMask & n) ==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was 1");
        }
    }
}
