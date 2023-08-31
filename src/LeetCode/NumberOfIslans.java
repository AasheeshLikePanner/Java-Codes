package LeetCode;

public class NumberOfIslans {
    public static void main(String[] args) {

    }
    public int numIslands(char[][] grid) {
     boolean[][] flag = new boolean[grid.length][grid[0].length];
     int count  = 0;
     for(int i = 0 ;i < grid.length; i++){
         for(int j = 0 ; j < grid[0].length;j++){
             if(!flag[i][j] && grid[i][j] == '1'){
                 count++;
                 helper(grid, i , j , flag);
             }
         }
     }
     return count;
    }

    private void helper(char[][] grid, int i, int j, boolean[][] flag) {
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == '0'){
           return;
        }
        flag[i][j] = true;
        if(!flag[i][j + 1]){ // Right
            helper(grid, i, j + 1, flag);
        }
        if(!flag[i + 1][j]){ // Down
            helper(grid, i + 1, j, flag);
        }
        if(!flag[i][j - 1]){ // left
            helper(grid, i, j - 1, flag);
        }
        if(!flag[i - 1][j]){ // UP
            helper(grid, i - 1, j , flag);
        }
    }
}
