package LeetCode;

import java.util.*;
public class Traingle {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        in.add(2);
        list.add(new ArrayList<>(in));
        in.remove(0);
        in.add(3);
        in.add(4);
        list.add(new ArrayList<>(in));
        in.remove(0);
        in.remove(0);
        in.add(6);
        in.add(5);
        in.add(7);
        list.add(new ArrayList<>(in));
        System.out.println(minimumTotal(list));
    }
//    public static int minimumTotal(List<List<Integer>> triangle) {
//        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1). size()];
//        for(int[] one: dp){
//            Arrays.fill(one, - 1);
//        }
//        return helper(triangle, 0, 0, dp);
//    }
//
//    private static int helper(List<List<Integer>> triangle, int row, int col, int[][] dp) {
//        if(col < 0 || col >= triangle.get(row).size()){
//            return 100000;
//        }
//        if(row == triangle.size() - 1){
//            return triangle.get(row).get(col);
//        }
//        if(dp[row][col] != -1) return dp[row][col];
//        int one = triangle.get(row).get(col) + helper(triangle, row + 1, col + 1, dp);
//        int two = triangle.get(row).get(col) + helper(triangle, row + 1, col, dp);
//        return dp[row][col] = Math.min(one, two);
//    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int m =triangle.get(triangle.size() - 1). size();
        int n =triangle.size();
        int[][] dp = new int[n][m];
       for(int i = 0; i < m;i++){
            dp[n -1][i] = triangle.get(n - 1).get(i);
       }
       for(int i = n - 2; i >= 0; i--){
           for(int j = triangle.get(i).size() - 1; j >= 0; j--){
               int one = triangle.get(i).get(j) + dp[i + 1][j + 1];
               int two = triangle.get(i).get(j) +  dp[i + 1][j];
               dp[i][j] = Math.min(one, two);
           }
       }
        return dp[0][0];
    }
}