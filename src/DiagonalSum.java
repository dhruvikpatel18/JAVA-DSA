public class DiagonalSum {
    public static int diagonalSum(int[][] matrix){
        //primary diagonal(top left to bottom right) => row == col
        //secondary diagonal(top right to bottom left) => row+col = matrix.length-1;

//        //brute force
//        //T.C- O(N^2)
//        int sum = 0;
//        for(int i =0; i<matrix.length; i++){
//            for(int j=0; j<matrix[0].length; i++){
//                if(i == j){//primary diagonal
//                    sum += matrix[i][j];
//                }else if(i+j == matrix.length-1){//secondary diagonal
//                    sum += matrix[i][j];
//                }
//            }
//        }
//        return sum;

        //optimal approch
        //T.C- O(N)
        int sum = 0;
        for(int i =0; i<matrix.length; i++){
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagoal
            if(i != matrix.length-i-1)//for common element of both diagonal
            sum += matrix[i][matrix.length-i-1];// j = n-i-1
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{8,7,6,5},{12,11,10,9}};
        System.out.println(diagonalSum(matrix));
    }
}
