package String;

public class alphabetIncoding {
    public static String convertToAlphabet(String str){
        int count =0;
        String ans ="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) =='1'){
                count++;
            }
            else{
                if (count>0) {
                    ans += (char)(64+count);
                }
            }
        }

    }
    public static void main(String[] args) {
        String str ="11101101111";
        
    }
}
