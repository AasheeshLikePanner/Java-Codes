package Contest;

import java.util.*;

public class WidthofColoumnsGrid {
    public static void main(String[] args) {
        int[][] grid = {{-15,1,3},{15,7,12},{5,6,-2}};
        int[][] grid2 ={{0}};
        System.out.println(Arrays.toString(findColumnWidth(grid2)));
    }
    public static int[] findColumnWidth(int[][] grid) {
        int[] result = new int[grid[0].length];
        int max = 0;
        for(int i = 0 ;i< grid[0].length ; i++){
            for(int j = 0; j < grid.length ; j++){
                int n = grid[j][i];
                if(n < 0 ){
                    max = Math.max( max, (int) (Math.log10(Math.abs(n)) + 2));
                }
                else if(n == 0){
                    max  = Math.max(max, 1);
                }
                else {
                    max = Math.max( max, (int) (Math.log10(n) + 1));
                }
            }
            result[i] = max;
            max = 0;
        }
        return result;
    }
}
