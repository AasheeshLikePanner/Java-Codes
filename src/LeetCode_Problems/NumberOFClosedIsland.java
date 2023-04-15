package LeetCode_Problems;

public class NumberOFClosedIsland {
    public static void main(String[] args) {
        int[][] can= {{0, 0, 1, 0, 0},{0, 1, 0, 1, 0},{0, 1, 1, 1, 0}};
        System.out.println(closedIsland(can));

    }
    public static int closedIsland(int[][] grid) {
        int count = 0;
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        for(int i = 1 ; i < grid.length - 1; i++){
            for(int j = 1 ; j < grid[0].length - 1; j++){
                if(!visit[i][j] && grid[i][j] == 0){
                    if(safe(grid , i , j , visit)){
                        count+=1;
                    }
                }
            }
        }
        return count;
    }

    private static boolean safe(int[][] grid, int i, int j, boolean[][] visit) {
        if((i == 0 || j == grid[0].length - 1) || (j == 0 || i == grid.length)) return false;
        visit[i][j] = true;
        boolean res1 = (visit[i - 1][j]) || (grid[i - 1][j] != 0) || safe(grid, i - 1, j, visit);
        boolean res2 = (visit[i + 1][j]) || (grid[i + 1][j] != 0) || safe(grid, i + 1, j, visit);
        boolean res3 = (visit[i][j + 1]) || (grid[i][j + 1] != 0) || safe(grid, i, j + 1, visit);
        boolean res4 = (visit[i][j - 1]) || (grid[i][j - 1] != 0) || safe(grid, i, j - 1, visit);
        return (res1 && res2) && (res3 && res4);
    }
}
