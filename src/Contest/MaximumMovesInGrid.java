package Contest;

public class MaximumMovesInGrid {
    public static void main(String[] args) {
        int[][] arr = {{2,4,3,5},{2,4,3,5},{3,4,2,11},{10,9,13,15}};
        System.out.println(maxMoves(arr));
    }

    public static int maxMoves(int[][] grid) {
        for(int i = 0 ; i< grid.length; i++){
            for(int j = 0; j < grid[0].length ; j++){
                solve(grid ,i , j , 0);
            }
        }
        return max;
    }
    static int max = 0;
    public static void solve(int[][] grid , int row, int col, int sum){
         sum += grid[row][col];
         max = Math.max(sum, max);
        if((row < grid.length - 1 && col < grid[0].length - 1)&& (grid[row][col] < grid[row+ 1][col+1])){       // diagonaly right moving
            solve(grid,row + 1, col + 1 , sum);
        }
        if(col < grid[0].length - 1 && grid[row][col] < grid[row][col + 1]){   //left moving
            solve(grid,row, col + 1, sum);
        }
        if((row > 0 && col < grid[0].length - 1) && (grid[row][col] < grid[row - 1][col + 1])){       // Diagonaly left moving
            solve(grid , row - 1, col + 1, sum);
        }
    }
}
