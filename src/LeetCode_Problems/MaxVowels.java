package LeetCode_Problems;

import java.util.HashMap;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        System.out.println(max(s, 3));

    }
    public static int max(String s, int k){
        char[] arr= s.toCharArray();
        int i = 0;
        int j = 0;
        int count  =0;
        int max = 0;
        while(j < arr.length){
            if(arr[j] == 'i' || arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'o' || arr[j] == 'u'){
                count++;
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                max = Math.max(max, count);
                if(arr[i] == 'i' || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u'){
                    count--;
                }
                i++;
                j++;
            }
        }
        return max;
    }
}
