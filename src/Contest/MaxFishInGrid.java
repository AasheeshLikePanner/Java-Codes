package Contest;

public class MaxFishInGrid {
    public static void main(String[] args) {
        int[][] arr1 = {{0,2,1,0}, {4,0,0,3}, {1,0,0,4}, {0,3,2,0}};
        int[][] arr2= {{10,5},{8,0}};
        System.out.println(fish(arr2));
    }

    public static int fish(int[][] grid) {
        boolean[][] flag = new boolean[grid.length][grid[0].length];;
        for (int i = 0 ; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0){
                    isMax(grid ,flag, i ,j, grid[i][j]);
                    flag[i][j] = false;
                }
            }
        }
        return max;
    }

    static int max = 0;

    private static void isMax(int[][] grid , boolean[][] flag, int r, int c , int sum) {
        flag[r][c] = true;
        max = Math.max(sum , max);
        if(c > 0 &&  (!flag[r][c - 1] && grid[r][c- 1] != 0)){
            isMax(grid , flag, r,  c -1,sum + grid[r][c- 1]);
            flag[r][c - 1]= false;
        }
        if(r > 0 &&  (!flag[r - 1][c] &&  grid[r - 1][c] != 0)){
            isMax(grid , flag, r - 1,  c ,sum + grid[r - 1][c]);
            flag[r - 1][c]= false;
        }
        if(c < grid[0].length - 1 &&  ( !flag[r][c+ 1]&& grid[r][c + 1] != 0)){
            isMax(grid, flag , r,  c  + 1,sum + grid[r][c + 1]);
            flag[r][c + 1]= false;
        }
        if(r < grid.length - 1 &&  (!flag[r+ 1][c] && grid[r + 1][c] != 0)){
            isMax(grid , flag, r + 1,  c,sum + grid[r + 1][c]);
            flag[r + 1][c]= false;
        }
    }


}
