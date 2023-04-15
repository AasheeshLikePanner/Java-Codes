package LeetCode_Problems;

public class search_in_2d_matrix_II {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ; i < matrix.length ; i++){
            if(binary(matrix, i, target)){
                return true;
            }
            if(target > matrix[i][matrix[0].length - 1]){
                return false;
            }
        }
        return false;
    }

    private boolean binary(int[][] matrix, int row, int target) {
        int start = 0;
        int end = matrix.length ;
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(target == matrix[row][end]){
                return true;
            }
            if(matrix[row][mid] > target){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }
}
