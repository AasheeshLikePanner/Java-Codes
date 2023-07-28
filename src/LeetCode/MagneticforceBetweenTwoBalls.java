package LeetCode;

import java.util.Arrays;

public class MagneticforceBetweenTwoBalls {
    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{5,4,3,2,1,1000000000}, 2));
        System.out.println(maxDistance(new int[]{1,2,3,4,7}, 3));
        System.out.println(maxDistance(new int[]{1,2,3,4,5,6,7,8,9,10}, 4));
    }
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        long start = 0;
        long end = position[position.length - 1];
        long res = 0;
        while(start <= end){
            long mid = start + (end - start)/2;
            boolean flag = binary(position, mid, m);
            if(flag){
                res = Math.max(res, mid);
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (int) res;
    }

    private static boolean binary(int[] position, long mid, int m) {
        int ballcount=1;
        int lastposition=position[0];
        for(int n : position) {
            if (n - lastposition >= mid) {
                ballcount++;
                if (ballcount == m) {
                    return true;
                }
                lastposition = n;
            }
        }
        return ballcount >= m;
    }
}
