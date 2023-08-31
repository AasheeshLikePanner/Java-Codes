package LeetCode;

import java.util.Arrays;

public class ShortestPath {
    public static void main(String[] args) {
        System.out.println(shortestDistance(3,4,new int[][]{{1,0,0,0}, {1,1,0,1},{0,1,1,1}}, 2,3));
        System.out.println(shortestDistance(3,4, new int[][]{{1,1,1,1},{0,0,0,1},{0,0,0,1}},0,3));
    }
    static int shortestDistance(int N, int M, int A[][], int X, int Y) {
        long[][] dp = new long[N + 1][M + 1];
        for(long[] arr: dp){
            Arrays.fill(arr, - 1);
        }
        boolean[][] flag = new boolean[N][M];
        return (int) helper(A, X, Y, flag, dp);
    }

    private static long helper(int[][] arr, int x, int y, boolean[][] flag, long[][] dp) {
        if(dp[x][y] != - 1){
            return dp[x][y];
        }
        if(x == 0 && y == 0){
            return 0;
        }
        long one = Integer.MAX_VALUE;
        long two = Integer.MAX_VALUE;
        long three = Integer.MAX_VALUE;
        long four = Integer.MAX_VALUE;
        if(( y > 0 && !flag[x][y- 1]) && arr[x][y - 1] ==  1){
            flag[x][y - 1] = true;
            one = 1 + helper(arr, x, y - 1, flag, dp);
            flag[x][y - 1] = false;
        }
        if((x > 0 && !flag[x - 1][y]) && arr[x - 1][y] ==  1){
            flag[x - 1][y] = true;
            two = 1 + helper(arr, x - 1, y, flag, dp);
            flag[x - 1][y] = false;
        }
        if((y < arr[0].length - 1 && !flag[x][y+ 1]) && arr[x][y + 1] ==  1){
            flag[x][y + 1] = true;
            three = 1 + helper(arr, x, y + 1, flag, dp);
            flag[x][y + 1] = false;
        }
        if((x < arr.length - 1 && !flag[x + 1][y]) && arr[x + 1][y] ==  1){
            flag[x + 1][y] = true;
            four = 1 + helper(arr, x + 1, y, flag, dp);
            flag[x + 1][y] = false;
        }
        return dp[x][y] = Math.min(one, Math.min(three, Math.min(two, four)));
    }
}
