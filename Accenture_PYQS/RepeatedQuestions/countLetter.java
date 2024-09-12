package RepeatedQuestions;
import java.util.Scanner;

public class countLetter {
    public static int countChar(String s){
        int count =0;
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i) !=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s  = sc.nextLine();
        System.out.println(countChar(s));

    }
}
