package Backtracking;

/**
 * This is the most famous problem
 * Of the backtracking solved
 * By the recursion and backtracking.
 * This is an advanced Topic of DSA
 */
public class N_queen {
    public static boolean nQueen(int board[][],int row,int n){
        if(row==n)
            return true;
        for (int col=0; col<n; col++){
            if(isSafe(board,row,col,n)){
                board[row][col]=1;
                if(nQueen(board,row+1,n)){
                    return true;
                }
                //This only statement that ensures backtracking
                board[row][col]=0;
            }
        }

        return false;
    }

    /**
     * This function only checks.
     * This position is safe or not
     * for placing the queen here
     * if safe return true otherwise false
     */
    private static boolean isSafe(int[][] board, int row, int col,int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[n][n];
        System.out.println(nQueen(board,0,n));

        //Print the board with the queen position
        System.out.println("Board Layout");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
