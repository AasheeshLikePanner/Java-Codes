package LeetCode_Problems;

public class PrimeDaigonally {
    public static void main(String[] args) {
        int[][] can = {{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(diagonalPrime(can));
    }
    public static int diagonalPrime(int[][] nums) {
        int max = 0;
        int i = nums.length/ 2;
        int j = nums[0].length / 2;
        int n = i;
        int m = j;
        while(n >= 0){
            boolean flag = isPrime(nums[n][m]);
            if(flag){
                max = Math.max(nums[n][m] , max);

            }
            n -=1;
            m+=1;
        }
         n = i;
         m = j;
        while(n >= 0){
            boolean flag = isPrime(nums[n][m]);
            if(flag){
                max = Math.max(nums[n][m] , max);

            }
            n -=1;
            m+=1;
        }
         n = i;
        m = j;
        while(n > nums.length){
            boolean flag = isPrime(nums[n][m]);
            if(flag){
                max = Math.max(nums[n][m] , max);

            }
            n -=1;
            m+=1;

        }
        n = i;
        m = j;
        while(n > nums.length){
            boolean flag = isPrime(nums[n][m]);
            if(flag){
                max = Math.max(nums[n][m] , max);

            }
            n -=1;
            m+=1;
        }
        return max;


    }
    public  static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
