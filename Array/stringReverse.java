public class stringReverse {
    public static String reverse(String str){
        String revrse_str ="";
        for(int i=0; i<str.length(); i++){
            revrse_str = str.charAt(i) + revrse_str;
    }
    return revrse_str;
}
    public static void main(String[] args) {
        String str ="hello Ankit";
        System.out.println(reverse(str)); // olleh
    }
}
