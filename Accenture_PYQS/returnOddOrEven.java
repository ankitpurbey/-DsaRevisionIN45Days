public class returnOddOrEven {
    public static String oddOrEven(int arr[]){
        String s ="";
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                s +="odd";
            }
            else{
                s += "Even";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,4,5,7};
        System.out.println(oddOrEven(arr));
    }
}
