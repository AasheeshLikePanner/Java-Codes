package LeetCode_Problems;

public class Q1011 {
    public static void main(String[] args) {
        int[] test1= {3,2,2,4,1,4};
        int[] test2 = {1,2,3,4,5,6,7,8,9,10};
        int[] test3 = {1,2,3,1,1};
        System.out.println(shipWithinDays(test1,3));
//        System.out.println(shipWithinDays(test2 , 5));
//        System.out.println(shipWithinDays(test3 , 4));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        int ans =0;
        for(int man : weights){
            start = Math.max(start , man);
            end += man;
        }
        while(start <  end){
            int mid = start + (end - start)/2;
            if(days(weights , mid) <= days){
                ans = mid;
                end = mid;
            }
            else{
                start = mid  +1;
            }
        }
        return ans;
    }

    private static int days(int[] can, int weight) {
        int result = 0;
        int temp = 0;
        for (int j : can) {
            if (temp + j>= weight) {
                temp = 0 ;
                result += 1;
            }

            temp += j;
        }
        return result ;
    }
}
