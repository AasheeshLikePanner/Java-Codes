package LeetCode;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n == 1)  return true;
        long val = 1;
        while(val < n){
            val *= 2;
        }
        return val == n;
    }
}
