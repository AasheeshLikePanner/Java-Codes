package LeetCode_Problems;

import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(man("pwwkew"));
        System.out.println(man("abcabcbb"));
    }
    public static int man(String s) {
        int i =0 ;
        int j =0 ;
        HashMap<Character , Integer> map = new HashMap<>();
        int max = 0;
        while(j < s.length()){
            if(map.containsKey(s.charAt(j))){
                map.remove(s.charAt(i));
                i++;
            }
            else{
                max = Math.max(max , j -i + 1);
                map.put(s.charAt(j) , 1);
                j++;
            }
        }
        return max;
    }
}
