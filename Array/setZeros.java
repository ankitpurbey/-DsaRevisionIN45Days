public class setZeros {
    public static void zeros(int [][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int rowArr[] = new int[row];
        int colArr[] = new int[col];

        for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                if(matrix[i][j] ==0){
                    rowArr[i] =1;
                    colArr[j] =1;
                }
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(rowArr[i] ==1 || colArr[j]==1){
                    rowArr[i] = 0;
                    colArr[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        
    }
}
