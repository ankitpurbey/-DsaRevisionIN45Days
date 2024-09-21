package Accenture_PYQS;
public class floydPattern {
    public static int  printFloydPattern(int n){
        int count =1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFloydPattern(n));
    }
}
