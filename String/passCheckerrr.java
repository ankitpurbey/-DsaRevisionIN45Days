package String;
import java.util.Scanner;

public class passCheckerrr {
    


    public static int checkPassword(char[] str, int n) {
        // At least 4 characters
        if (n < 4)
            return 0;
        // Starting character must not be a number
        if (Character.isDigit(str[0]))
            return 0;
        int a = 0, cap = 0, nu = 0;
        while (a < n) {
            // Must not have space or slash (/)
            if (str[a] == ' ' || str[a] == '/')
                return 0;
            // counting capital letters
            if (Character.isUpperCase(str[a])) {
                cap++;
            }
            // counting numeric digit
            else if (Character.isDigit(str[a]))
                nu++;
            // incrementing for while loop
            a++;
        }
        // returns 1 if there are > 0 numeric digits and capital letters
        return (cap > 0 && nu > 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();
        char[] c = s.toCharArray();
        System.out.println(checkPassword(c, len));
        scanner.close();
    }
}



