package Accenture_PYQS;
import java.util.Scanner;
public class question25 {
    public static void operationChoice(int a, int b, int c){
        if(c==1){
            System.out.println(a+b);
        }
        else if(c==2){
           System.out.println(a-b);
        }
        else if(c==3){
            System.out.println(a*b);
        }
        else if(c==4){
            System.out.println(a/b);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        operationChoice(a, b, c);

    }
}
