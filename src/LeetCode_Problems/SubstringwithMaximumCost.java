package LeetCode_Problems;

import java.util.*;
import java.util.ArrayList;

public class SubstringwithMaximumCost {
    public static void main(String[] args) {
        int[] can = {-1000};
        System.out.println(maximumCostSubstring("adaa" , "d" , can));
    }
    public static int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] can = new int[s.length()];
        HashMap<Character , Integer> hash = new HashMap<>();
        char[] ch = s.toCharArray();
        char[] map = chars.toCharArray();
        int index = 0;
        for(char man:map){
            hash.put(man, vals[index]);
            index++;
        }
        for(int i = 0; i< ch.length ; i++){
            if(!hash.containsKey(ch[i])){
                can[i] = (ch[i] + 0) - 96;
            }
            else{
                can[i] = hash.get(ch[i]);
            }
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ;i < can.length ; i++){
            for(int j = i; j < can.length ; j++){
                sum += can[j];
                max = Math.max(max , sum);
                if(sum < 0){
                    break;
                }
            }
            sum = 0;
        }
        if(max < 0){
            return 0;
        }
        return max;
    }
}
