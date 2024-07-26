public class diagonalSUm {

    public static int diagonalSum(int arr[][]) {
        int n = arr.length;
        int sum =0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(i==j){
                    sum+= arr[i][j];
                }
                else if(i+j == n-1){
                    sum+= arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Sum of diagonal elements: " + diagonalSum(arr));  // Output: 30  (1+5+9+13 + 7+11+15+16)  (top left to bottom right)
    }
    }

