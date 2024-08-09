package String;
import java.util.Scanner;
public class replaceChar {

    


    public static void replaceCharacter(char[] str, int n, char ch1, char ch2) {
        for (int i = 0; i < n; i++) {
            if (str[i] == ch1) {
                str[i] = ch2;
            } else if (str[i] == ch2) {
                str[i] = ch1;
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = new char[100];
        char b, c;
        int len;

        String input = scanner.nextLine();
        a = input.toCharArray();
        b = scanner.next().charAt(0);
        c = scanner.next().charAt(0);

        len = a.length;
        replaceCharacter(a, len, b, c);

        scanner.close();
    }
}

