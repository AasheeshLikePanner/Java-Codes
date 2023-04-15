package LeetCode_Problems;

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {
        String s = "cat";
        String t = "tac";
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> hash1 = new HashMap<>();
        HashMap<Character , Integer> hash2 = new HashMap<>();
        char[] one = s.toCharArray();
        char[] two = t.toCharArray();
        for(char ch: one){
            if(hash1.containsKey(ch)){
                int previous = hash1.get(ch);
                int next = previous + 1;
                hash1.put(ch , next);
            }
            else{
                hash1.put(ch , 1);
            }
        }
        for(char ch: two){
            if(hash1.containsKey(ch)){
                int previous = hash2.get(ch);
                int next = previous + 1;
                hash2.put(ch , next);
            }
            else{
                hash2.put(ch , 1);
            }
        }
        for(char ch: one){
            if(hash1.containsKey(ch) && hash2.containsKey(ch)){
                if(hash1.get(ch) != hash2.get(ch)){
                    return false;
                }
                hash1.remove(ch);
                hash2.remove(ch);
            }
            else if(!hash1.containsKey(ch) || !hash2.containsKey(ch)){
                return false;
            }
        }
        return true;
    }
}
