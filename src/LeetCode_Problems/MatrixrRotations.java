package LeetCode_Problems;

public class MatrixrRotations {
    public static void main(String[] args) {

    }
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean[][] flag = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(!isCheck(target , i ,j, flag)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isCheck(int[][] mat, int i, int j, boolean[][] flag){
        int m = mat.length;
        int n = mat[0].length;
        if(!flag[j][n-i-1]&& mat[j][n-i-1] == 1){
            flag[j][n-i-1] = true;
            return true;
        }
        if(!flag[m-i-1][n-j-1]&& mat[m-i-1][n-j-1] == 1){
            flag[m-i-1][n-j-1] = true;
            return true;
        }
        if(!flag[n-j-1][i]&& mat[n-j-1][i] == 1){
            flag[n-j-1][i] = true;
            return true;
        }
        if(!flag[i][j]&& mat[i][j] == 1){
            flag[i][j] = true;
            return true;
        }
        return false;
    }
}
