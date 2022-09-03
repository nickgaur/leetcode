class Solution {
    
    static boolean canIPlace(boolean board[][], int row, int col){
        // checking the column
        for(int i=row-1; i>=0 ;i--){
            if(board[i][col]){
                return false;
            }
        }

        // checking the right diagonal
        for(int j=col, i = row; j < board.length && i >= 0; j++, i--){
            if(board[i][j]){
                return false;
            }
        }
        
        // checking the left diagonal
        for(int j=col, i = row; j >=0 && i >= 0; j--, i--){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    
    static int solve(boolean board[][],int n, int row){
        int count = 0;
        if(row == n){
            return 1;
        }
        for(int i=0; i<n; i++){
            if(canIPlace(board, row, i)){
                board[row][i] = true;
                count += solve(board, n, row+1);
                board[row][i] = false;
            }    
        }
        return count;
    }
    
    public int totalNQueens(int n) {
        boolean board[][] = new boolean[n][n];
        return solve(board, n, 0);
        
    }
}