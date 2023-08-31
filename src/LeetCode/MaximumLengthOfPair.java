package LeetCode;

import java.util.Arrays;

public class MaximumLengthOfPair {
    public static void main(String[] args) {

    }
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
        int r = pairs[0][1];
        int count = 0;
        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0] > r){
                r = pairs[i][1];
                count++;
            }
        }
        return count;
    }
}
