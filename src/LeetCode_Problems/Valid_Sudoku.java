package LeetCode_Problems;

import java.util.*;
public class Valid_Sudoku {
    public static void main(String[] args) {
        String[][] can = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},
                {"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},
                {".",".",".",".","8",".",".","7","9"}};
        char[][] man = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = can[i][j].charAt(0);
                man[i][j] = ch;
            }
        }
        System.out.println(isValidSudoku(man));
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0; j < board[0].length;j++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                if(!isSafe(board , i ,j ,ch )){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSafe(char[][] board, int row, int col, char ch) {
        for (int i = col + 1; i < board.length; i++) {
            if (board[row][i] == ch) {
                return false;
            }
        }
        for (int i = row + 1; i < 9; i++) {
            if(board[i][col] == ch){
                return false;
            }
        }
        int rowStart = row - row%3;
        int colStart = col - col%3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3 ; j++) {
                if(row == i && col == j){
                    continue;
                }
                if(board[i][j] == ch){
                    return false;
                }
            }
        }
        return true;
    }
}
