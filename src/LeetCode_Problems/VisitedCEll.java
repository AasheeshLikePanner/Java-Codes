package LeetCode_Problems;

public class VisitedCEll {
    public static void main(String[] args) {
        int[][] ans1 = {{3,4,2,1},{4,2,1,1},{2,1,0,0},{3,4,1,0}};
        int[][] ans = {{3,4,2,1},{4,2,3,1},{2,1,0,0},{2,4,0,0}};
        int[][] ans2= {{1,0,11},{1,14,10},{12,10,2},{2,0,0},{13,0,0}};
        System.out.println(minimumVisitedCells(ans  ));
    }

    public static int minimumVisitedCells(int[][] grid) {
        walk(grid, 0, 0 , 0);
        return count;
    }

    private static void walk(int[][] can, int row, int col , int step) {
        if(row >= can.length - 1&& col >= can[0].length - 1){
            count = Math.min(step + 1,count);
            return;
        }
        if(row >= can.length || col >= can[0].length){
            return;
        }
        for (int i = can.length - 1; i >= 0 && i > row; i--) {
            if ( i <= can[row][col] + row) {
                walk(can, i, col, step + 1);
            }
        }
            for (int i = can[0].length - 1; i >= 0 && i > col ; i--) {
                int sum =can[row][col] + col;
                if ( i <= sum) {
                    walk(can, row, i , step + 1);
                }
            }
        }

        static int count = Integer.MAX_VALUE;
    }

