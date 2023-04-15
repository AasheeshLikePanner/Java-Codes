package LeetCode_Problems;

public class NumberOfEncalves {
    public static void main(String[] args) {
        int[][] can1 = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(numEnclaves(can1));
    }
    public static int numEnclaves(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] flag = new boolean[n][m];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if((i != 0 && i != n - 1) && (j == 0 || j == m - 1)){
                    if(grid[i][j] == 1 && !flag[i][j]){
                        visit(grid,i,j,flag);
                        j = n - 2;
                    }
                }
                else if((i == 0 || i == n - 1)){
                    if(grid[i][j] == 1 && !flag[i][j]){
                        visit(grid,i,j,flag);
                    }
                }
            }
        }
        for(int i = 1 ; i < n - 1; i++){
            for(int j = 1 ; j< m - 1; j++){
                if(!flag[i][j] && grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    private static void visit(int[][] grid, int i, int j, boolean[][] flag) {
        flag[i][j] = true;
        if((i < grid.length - 1 && grid[i + 1][j] == 1)&& !flag[i+1][j]){       // Down
            visit(grid, i + 1, j , flag);
        }
        if((i > 0  && grid[i - 1][j] == 1)&& !flag[i-1][j]){       // Up
            visit(grid, i - 1, j , flag);
        }
        if((j < grid[0].length - 1 && grid[i][j +1] == 1)&& !flag[i][j+ 1]){       // Right
            visit(grid, i , j + 1, flag);
        }
        if((j > 0 && grid[i][j - 1] == 1)&& !flag[i][j - 1]){       // Left
            visit(grid, i, j - 1, flag);
        }
    }
}
