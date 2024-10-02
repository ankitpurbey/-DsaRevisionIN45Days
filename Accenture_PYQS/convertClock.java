package Accenture_PYQS;

public class convertClock {
    public static int[] convertClockInto24Format(int n1, int n2){
        // int newArr[] = new int[2];

        if(n1>12){
            n1 = n1-12;
        }
        return new int[]{n1,n2};
    }
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 16;
        System.out.println(convertClockInto24Format(n1, n2));
    }
}
