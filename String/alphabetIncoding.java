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
                    count =0;
                }
            }
        }
        if(count>0){
            ans += (char)(64+count);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str ="11101101111";
        System.out.println(convertToAlphabet(str));
        
    }
}
