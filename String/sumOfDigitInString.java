package String;

public class sumOfDigitInString {
    public static int countDigit(String str){
        int count =1;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                count = count + str.charAt(i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str ="Ankit321";
        System.out.println(countDigit(str));
    }
}
