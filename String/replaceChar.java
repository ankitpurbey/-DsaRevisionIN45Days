package String;
import java.util.Scanner;
public class replaceChar {

    public static void replaceChar(String str, char ch1, char ch2){
        int n = str.length();
        for(int i=0; i<n; i++  ){
            Character ch = str.charAt(i);
            if(str.charAt(i) == ch1){
                ch = ch2;
            }
            else if( str.charAt(i) == ch2){
                ch= ch1;
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        char ch1 = 'a';
        char ch2 ='p';
        replaceChar(str, ch1, ch2);
        
    }
}
