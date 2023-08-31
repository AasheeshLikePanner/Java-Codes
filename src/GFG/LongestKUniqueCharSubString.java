package GFG;

import java.util.HashMap;

public class LongestKUniqueCharSubString {
    public static void main(String[] args) {
        System.out.println(longestkSubstr("aaaa", 2));
    }
    public static int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0)  + 1);
            if(map.size() == k){
                max = Math.max(max, j - i + 1);
            }
            else if(map.size() > k){
                char one = s.charAt(i);
                while(map.size() > k){
                    map.put(s.charAt(i) , map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        return max;
    }

}
