public class Nqueens {
    //TC:O(n!)
    public static boolean isSafe(char[][] board,int row, int col){
        //vertical
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--){
                if(board[i][j] == 'Q'){
                    return false;
                }
        }
        //right diagonal
        for(int i=row-1,j=col+1; i>=0&&j< board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char[][] board, int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        for(int i=0; i<board.length; i++){
            if(isSafe(board,row,i)){
                board[row][i] = 'Q';
                nQueens(board,row+1);
                //backtrack
                board[row][i] = '.';
            }
        }
    }
    public static void printBoard(char[][] board){
        System.out.println("_______chess board________");
        for(int i=0; i<board.length; i++){
            for(int j=0;j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        //initialize
        for(int i=0; i<board.length; i++){
            for(int j=0; j< board.length; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board,0);
    }
}
