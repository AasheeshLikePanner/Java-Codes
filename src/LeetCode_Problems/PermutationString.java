package LeetCode_Problems;

import java.util.HashMap;

public class PermutationString {
    public static void main(String[] args) {
        String s1 =
                "hello" ,s2 =
                "ooolleoooleh";
//        String s1 =
//                "abcdxabcde",
//        s2 =
//                "abcdeabcdx";
        System.out.println(checkInclusion(s1 , s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length() || (s1.length() == s2.length() && s1.equals(s2))){
            return false;
        }
        int i = 0;
        int j = 0;
//        int count = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch:s1.toCharArray()){
            if(map.containsKey(ch)) map.put(ch , map.getOrDefault(ch , 1) + 1);
            else map.put(ch , 1);
        }
        int count = map.size();
        while(j < s2.length()){
            char one = s2.charAt(j);
            if(map.containsKey(one)){
                map.put( one ,map.get(one) - 1);
                if(map.get(one) == 0){
                    count--;
                }
            }
            if(j - i + 1 < s1.length())   j++;
            else if(j - i + 1 == s1.length()){
                if(count == 0){
                    return true;
                }
                char two = s2.charAt(i);
                if(map.containsKey(two)){
                    if(map.get(two) == 0){
                        count++;
                    }
                    map.put(two , map.get(two) + 1);
                }
                i++;
                j++;
            }
        }
        return false;
    }
}
