public class occuranceOfC {
    public static int countOcc(String str, Character c) {
        int count = 0;
        String s = str.toLowerCase();
        for(int i=0; i<s.length(); i++ ){
            if(c == s.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str ="Ankit Kumar";
        Character c ='a';
        System.out.println(countOcc(str, c));
    }
}
