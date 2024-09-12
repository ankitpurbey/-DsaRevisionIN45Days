package RepeatedQuestions;

public class primeOrNot {
    public static boolean finfPrimeOrNot(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n =3;
        System.out.println(finfPrimeOrNot(n));
    }
}
