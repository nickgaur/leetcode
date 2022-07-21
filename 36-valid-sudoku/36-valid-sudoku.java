class Solution {
    
    static boolean isValid(char[][] board, char value, int row, int col){
        
        // CHECKING ROW
        for(int i=0; i<9; i++){
            if(i != col && board[row][i] == value){
                return false;
            }
        }
        
        // CHECKING COLUMN
        for(int i=0; i<9; i++){
            if(i != row && board[i][col] == value){
                return false;
            }
        }
        
        // CHECKING GRID
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (i != row && j != col && board[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean solveSudoku(char[][] board, int row, int col){
        if(col == 9){
            col = 0;
            row = row + 1;
        }
        
        if(row == 9){
            return true;    
        }
        
        if(board[row][col] == '.'){
            return solveSudoku(board, row, col+1);
        }
        if(isValid(board, board[row][col], row, col)){
            return solveSudoku(board, row, col + 1);
        }
        else{
            return false;   
        }
    }
    
    public boolean isValidSudoku(char[][] board) {
        return solveSudoku(board, 0,0);
    }
}