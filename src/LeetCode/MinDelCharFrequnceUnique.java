package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinDelCharFrequnceUnique {
    public static void main(String[] args) {
        System.out.println(minDeletions("abcabc"));
    }
    public static int minDeletions(String s) {
        int del = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char key : map.keySet()){
            int val = map.get(key);
            map.put(key, - 1);
            while(map.containsValue(val)){
                val--;
                del++;
            }
            if(val == 0){
                map.put(key, - 1);
            }
        }
        return del;
    }
}
