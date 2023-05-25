package LeetCode_Problems;

public class LongestNiceSubarray {
    public static void main(String[] args) {
        int[] test1= {1,3,8,48,10};
        int[] test2 = {178830999,19325904,844110858,806734874,280746028,64,256,33554432,882197187,104359873,453049214,820924081,624788281,710612132,839991691};
        System.out.println(longestNiceSubarray(test2));
    }
    public static int longestNiceSubarray(int[] nums) {
        int start = 0 ;
        int end  = 1;
        int max = 1;
        while(end < nums.length ){
            if((nums[start] & nums[end]) == 0){
                int index = start + 1;
                while(index < end){
                    if(((nums[index] & nums[end]) != 0)){
                        end = start + 2;
                        start++;
                       break;
                    }
                    index++;
                }
                max = Math.max(max , end - start + 1);
                end++;
            }
            else if((nums[start] & nums[end]) != 0){
                start++;
                end++;
            }
        }
        return max;
    }
}
