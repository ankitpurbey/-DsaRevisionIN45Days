package String;

public class lastWordLength {
    public static int countLastWord(String str){
        int count =0;
        str.trim();
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == ' '){
                count =0;
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = " I am Ankit";
        System.out.println(countLastWord(str));
    }
}
