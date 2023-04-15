package LeetCode_Problems;

public class DistributToAnyStore {
    public static void main(String[] args) {
        int[] arr = {15,10,10};
        int[] arr1 = {11,6};
        System.out.println(minimizedMaximum(6, arr1));
        System.out.println(minimizedMaximum(7,arr));
    }
    public static int minimizedMaximum(int n, int[] quantities) {
        int ans =0 ;
        if(n == 1 && quantities.length == 1){
            return quantities[0];
        }
        int start = 0;
        int end = 0;
        for(int can:quantities) end = Math.max(can,end);
        while(start < end){
            int mid  = start + (end - start)/2;
            int sum = 0;
            for(int can:quantities){
                sum += (can + 1)/mid;
            }
            if(sum <= n){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
