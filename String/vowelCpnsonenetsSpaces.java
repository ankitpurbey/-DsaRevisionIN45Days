package String;

public class vowelCpnsonenetsSpaces {
    public static void countVowelConsSpace(String str){
        int vowel =0;
        int cons =0;
        int space =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) =='a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' ||str.charAt(i)== 'A' || str.charAt(i) =='E'  || str.charAt(i) =='I' || str.charAt(i) =='O' || str.charAt(i) =='U'){
                vowel++;
                
            }

            else if(str.charAt(i) ==' '){
                space++;
                
            }
            else{
                cons++;
                
            }
        }
        System.out.println("vowels:" + vowel);
        System.out.println("space:" +space);
        System.out.println("cons:" +cons);
    }
    public static void main(String[] args) {
        String str ="Ankit purbey";
        countVowelConsSpace(str);
    }
}
