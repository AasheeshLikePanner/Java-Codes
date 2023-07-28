package LeetCode;
import java.util.*;

public class LongetArthimaticSubsqunce {
    public static void main(String[] args) {
        System.out.println(longestSubsequence(new int[]{1,2,3,4}, 1));
        System.out.println(longestSubsequence(new int[]{1,3,5,7}, 1));
        System.out.println(longestSubsequence(new int[]{1,5,7,8,5,3,4,2,1}, -2));
    }
    public static int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for(int n :arr){
            if(map.containsKey(n - difference)){
                map.put(n, map.get(n - difference) + 1);
            }
            else{
                map.put(n , 1);
            }
            max = Math.max(map.get(n), max);
        }
        return max;
    }
}
