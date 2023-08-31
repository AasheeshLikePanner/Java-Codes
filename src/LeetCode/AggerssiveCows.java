package LeetCode;

import java.util.Arrays;

public class AggerssiveCows {
    public static void main(String[] args) {
        System.out.println(aggressiveCows(new int[]{0, 3, 4, 7, 10, 9}, 4));
    }
    public static int aggressiveCows(int []stalls, int k) {
        int e = stalls.length - 1;
        int s = 1;
        int max = 0;
        while(s < e){
            int mid = s + (e - s)/2;
            int count = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < stalls.length; i += mid){
                if(i + mid < stalls.length){
                    if(stalls[i + mid] < stalls[i]){
                        continue;
                    }
                    min = Math.min(min, Math.abs(stalls[i + mid]));
                }
                count++;
            }
            if(count >= k){
                max = Math.max(max, min);
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return max;
    }
}
