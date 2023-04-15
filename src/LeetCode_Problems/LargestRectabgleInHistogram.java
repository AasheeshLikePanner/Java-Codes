package LeetCode_Problems;

import java.util.Stack;

public class LargestRectabgleInHistogram {
    public static void main(String[] args) {
        int[] can = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(can));
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> index = new Stack<>();
        int max =0;
        index.push(0);
        for(int i =  1; i < heights.length ; i++){
            while(!index.isEmpty() && heights[i] < heights[index.peek()]){
                max = getmax(heights , index,  max , i);
            }
            index.push(i);
        }
        int i = heights.length;
        while(!index.isEmpty()){
            max = getmax(heights,index , max , i);
        }
        return max;
    }
    public static int getmax(int[] heights  , Stack<Integer> index, int max,  int i){
        int area;
        int popped = index.pop();
        if(index.isEmpty()){
            area = heights[popped] * i;
        }
        else {
            area = heights[popped] * (i - 1 - index.peek());
        }
        return Math.max(max , area);
    }

}
