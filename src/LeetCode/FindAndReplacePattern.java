package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        System.out.println(findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"},"abb"));
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap();
        int[] mp = new int[pattern.length()];
        int k = 1;
        int i = 0;
        for(char ch: pattern.toCharArray()){
            if(map.containsKey(ch)){
                mp[i++] = map.get(ch);
            }
            else {
                map.put(ch, k);
                mp[i++] = k++;
            }
        }
        for(String word:words){
            boolean flag  = true;
            HashMap<Character, Integer> innerMap = new HashMap<>();
            i = 0;
            k = 1;
            for(char ch:word.toCharArray()){
                if(innerMap.containsKey(ch)){
                    if(mp[i++] != innerMap.get(ch)){
                        flag = false;
                        break;
                    }
                }
                else {
                    innerMap.put(ch, k++);
                    if(mp[i++] != innerMap.get(ch)){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                list.add(word);
            }
        }
        return list;
    }
}
