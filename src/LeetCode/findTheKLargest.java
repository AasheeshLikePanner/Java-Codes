package LeetCode;

import java.util.Arrays;

public class findTheKLargest {
    public static void main(String[] args) {

    }
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a , b) -> {
            if(a.length() > b.length()){
                return 1;
            }
            if(b.length() > a.length()){
                return 0;
            }
            else{
                return isgreater(a,b);
            }
        });
        return nums[k - 1];
    }

    private int isgreater(String a, String b) {
        for(int i = 0;i < a.length(); i++){
            int one  = Integer.parseInt(String.valueOf(a.charAt(i)));
            int two = Integer.parseInt(String.valueOf(b.charAt(i)));
            if(one> two){
                return 1;
            }
            if(two > one){
                return  -1;
            }
        }
        return 0;
    }
}
