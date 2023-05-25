package LeetCode_Problems;

import java.util.HashMap;

public class MinmumWindowSubstring {
    public static void main(String[] args) {
        String  s = "ADOBECODEBANC", t = "ABC";
    }
    public String minWindow(String s, String t) {
        int min = 0;
        String result = "";
        int i =0 ;
        int j = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character , Integer> copy = new HashMap<>();
        while(j < s.length()){
            if(map.size() == t.length()){

            }

        }        return result;
    }
}
