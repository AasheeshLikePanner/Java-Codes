package LeetCode_Problems;

public class LargestRectangleHistogramBruteForce {
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4};
        int[] test2 = {2,1,5,6,2,3};
        System.out.println(make(test2));
    }
    public static int make(int[] heights) {
        int max = 0;
        for(int i = 0 ; i< heights.length ; i++){
            int left = left(heights , i);
            int right = right(heights , i);
            int sum = heights[i] * (left + right + 1);
            if(max < sum) max = sum;
        }
        return max;
    }
    private static int right(int[] can, int col) {
        int count = 0;
        for(int i = col + 1; i < can.length && can[i] >= can[col] ; i++){
            count++;
        }
        return count;
    }

    private static int left(int[] can, int col) {
        int count = 0;
        for(int i = col - 1; i >= 0 && can[i] >= can[col] ; i--){
            count++;
        }
        return count;
    }
}
