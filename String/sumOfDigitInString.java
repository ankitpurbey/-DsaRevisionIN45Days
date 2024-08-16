package String;

public class sumOfDigitInString {
    public static int countDigit(String str){
        String tempSum ="0";
        int count =1;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                count = count + str.charAt(i);
            }
            else{
                count += Integer.parseInt(tempSum);
                tempSum ="0";
            }
        }
        return count +Integer.parseInt(tempSum);
    }
    public static void main(String[] args) {
        String str ="Ankit321";
        System.out.println(countDigit(str));
    }
}
