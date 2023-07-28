package LeetCode;

public class CherryPickup {
    public static void main(String[] args) {
        System.out.println(cherryPickup(new int[][]{{0,1,-1},{1,0,-1},{1,1,1}}));
        System.out.println(cherryPickup(new int[][]{{1,1,-1},{1,-1,1},{-1,1,1}}));
    }
    public static int cherryPickup(int[][] grid) {
        int res  = hepler(grid, grid.length - 1, grid[0].length - 1,grid.length - 1, grid[0].length - 1, 0);
        if(flag1 && flag2){
            return res;
        }
        return 0;
    }
    static boolean flag1 = false;
    static boolean flag2 = false;
    private static int hepler(int[][] grid, int i1, int j1, int i2, int j2, int cherry) {
        if(i1 < 0 || j2 < 0 || i2 < 0 || j1 < 0){
            return 0;
        }
        if(i1 == 0 && j1 == 0)  flag1 = true;
        if(i2 == 0 && j2 == 0)  flag2 = true;
        if(grid[i1][j1] == -1 && grid[i2][j2] == -1){
            return 0;
        }
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        if(j1 != j2){
            one = grid[i1][j1] + grid[i2][j2] +  hepler(grid, i1 - 1, j1, i2 - 1, j2, cherry);
            two = grid[i1][j1] + grid[i2][j2] + hepler(grid, i1 - 1, j1, i2, j2 - 1, cherry);
            three =grid[i1][j1] + grid[i2][j2] + hepler(grid, i1, j1 - 1, i2 - 1, j2, cherry);
            four =grid[i1][j1] + grid[i2][j2] + hepler(grid, i1, j1 - 1, i2 , j2 - 1, cherry);
        }
        else{
            one = grid[i1][j2] +  hepler(grid, i1 - 1, j1, i2 - 1, j2, cherry);
            two =  grid[i1][j2] + hepler(grid, i1 - 1, j1, i2, j2 - 1, cherry);
            three = grid[i1][j2] +  hepler(grid, i1, j1 - 1, i2 - 1, j2, cherry);
            four =  grid[i1][j2] +  hepler(grid, i1, j1 - 1, i2 , j2 - 1, cherry);
        }

        return Math.max(one, Math.max(two, Math.max(three, four)));
    }
}
