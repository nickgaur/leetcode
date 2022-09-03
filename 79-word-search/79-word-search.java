class Solution {
    
    static boolean helper(char[][] board, String word, int index, int currRow, int currCol){
            
        if(index == word.length()){
            return true;
        }
        
        if(currRow == board.length || currCol == board[0].length || currRow < 0 || currCol < 0){
            return false;
        }
        
        if(board[currRow][currCol] != word.charAt(index)){
            return false;
        }
        char ch = board[currRow][currCol];
        board[currRow][currCol] = '0';
        
        boolean res = helper(board, word, index+1, currRow, currCol+1) ||
            helper(board, word, index+1, currRow + 1, currCol) ||
            helper(board, word, index+1, currRow , currCol-1) ||
            helper(board, word, index+1, currRow - 1, currCol);
        
        board[currRow][currCol] = ch;
        return res;
    }
    
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(helper(board, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }
}