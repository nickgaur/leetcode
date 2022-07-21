class Solution {
    
    static boolean isValid(char[][] board, char value, int row, int col){
        // CHECKING ROW
        for(int i=0; i<9; i++){
            if(board[row][i] == value){
                return false;
            }
        }
        
        // CHECKING COLUMN
        for(int i=0; i<9; i++){
            if(board[i][col] == value){
                return false;
            }
        }
        
        // CHECKING GRID
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i = startRow; i < startRow + 3; i++)
        {
            for(int j = startCol; j < startCol + 3; j++){
                if(board[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean sudokuSolver(char[][] board, int row, int col){
        
        // EDGE CASE
        if(col == 9){
            col = 0;
            row += 1;
        }
        
         // BASE CASE
        if(row == 9){
            return true;
        }
        
        // SMALL PROBLEM
        if(board[row][col] != '.'){
            return sudokuSolver(board, row, col+1);
        }
        for(int i=1; i<=9; i++){
            if(isValid(board, (char)(i+'0'), row, col)){
                board[row][col] = (char)(i+'0');
                boolean result = sudokuSolver(board, row, col + 1);
                    if(result){
                        return true;
                    }
                
                // BACKTRACK
                    board[row][col] = '.';
                }
            }
        return false;
    }
    public void solveSudoku(char[][] board) {
        boolean result = sudokuSolver(board, 0, 0);
        System.out.print(result);
    }
}