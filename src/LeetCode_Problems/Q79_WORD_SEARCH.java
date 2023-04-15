package LeetCode_Problems;

public class Q79_WORD_SEARCH {
    public static void main(String[] args) {
        char[][] can = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'} };
        char[][] can2 = {{'a'}};
        char[][] can3 = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word1 ="ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";
        System.out.println(exist(can2,"a"));
//        System.out.println(exist(can , word1));
//        System.out.println(exist(can , word2));
//        System.out.println(exist(can3 , "ABCESEEEFS"));
    }
    public static boolean exist(char[][] board, String word) {
        boolean[][] can = new boolean[board.length][board[0].length];
        for(int i =0 ; i < board.length ; i++){
            for (int j =0 ; j < board[0].length ; j++){
                if(word.charAt(0) == board[i][j]){
                    can[i][j] = true;
                    helper( i ,j ,word , "" + word.charAt(0) , board , can , 1);
                    can[i][j] = false;
                }
                if(flag){
                    return true;
                }

            }
        }
        return false;
    }

    private static void helper(int row, int col, String word, String temp ,char[][] board, boolean[][] can , int index) {
        if(temp.equals(word)){
            flag = true;
            return;
        }
        if(row < board.length - 1 && (!can[row + 1][col ] && word.charAt(index) == board[row + 1][col])){   // Down
            can[row ][col] = true;
            helper(row+ 1 , col , word ,temp + word.charAt(index) , board ,can , index + 1);
            can[row ][col] = false;
        }
        if(col > 0 && (!can[row][col - 1] && word.charAt(index) == board[row][col - 1])){       // Left
            can[row][col] = true;
            helper(row , col - 1, word ,temp + word.charAt(index) , board ,can , index + 1);
            can[row ][col] = false;
        }
        if(col < board[0].length - 1 && (!can[row][col + 1] && word.charAt(index) == board[row][col + 1])){     // right
            can[row][col] = true;
            helper(row , col + 1, word ,temp + word.charAt(index) , board ,can , index + 1);
            can[row ][col] = false;
        }
        if(row > 0 && (!can[row - 1][col ] && word.charAt(index) == board[row - 1][col])){      // UP
            can[row ][col] = true;
            helper(row - 1 , col , word ,temp + word.charAt(index) , board ,can , index + 1);
            can[row ][col] = false;
        }
    }

    static boolean flag = false;
}
