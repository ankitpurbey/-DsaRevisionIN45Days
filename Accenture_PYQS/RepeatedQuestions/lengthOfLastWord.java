package RepeatedQuestions;

public class lengthOfLastWord {
    public static int countLength(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            count++;
            if(s.charAt(i) == ' '){
                count =0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s ="Ankit Kumar";
        System.out.println(countLength(s));
    }
}
