package Accenture_PYQS;

public class findSumOfNegative {
    public static int FindValue(int a,int b, int c, int d){
        int res =0;
        if(a<0 ){
            res +=a;
        }
        if(b<0){
            res +=b;
        }
        if( c<0){
            res+=c;
        }
        if(d<0){
            res +=d;
        }
        // else{
        //     return 0;
        // }
        return res;
    }
    public static void main(String[] args) {
        int a =2;
        int b =-3;
        int c =-14;
        int d =7;

        System.out.println(FindValue(a, b, c, d));
    }
}
