package LeetCode_Problems;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s , t));
    }
    public static String minWindow(String s, String t) {
        int i = 0;
        int j = 0;
        int ansst =  -1;
        int ansend =  -1;
        StringBuilder str = new StringBuilder();
        int mini = Integer.MAX_VALUE;
        int count = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch: t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch  , map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
        }
        count = map.size();
        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) - 1);
                if(map.get(ch)==0){
                    count--;
                }
            }
            if(count > 0){
                j++;
            }
            else if(count == 0){
                if(j - i + 1 < mini){
                    ansst = i;
                    ansend = j;
                    mini = j - i + 1;
                }
                while(count==0){
                    char c2 = s.charAt(i);
                    if(map.containsKey(c2)){
                        map.put(c2,map.getOrDefault(c2,0)+1);
                        if(map.get(c2)==1)
                            count++;
                    }
                    i++;
                    if(count == 0 && j - i + 1 < mini){
                        ansst = i;
                        ansend = j;
                        mini = j - i + 1;
                    }
                }
                i++;
                j++;
            }
        }
        if(ansst != - 1&& ansend != -1){
            for(int k = ansst ; k <=  ansend ; k++){
                str.append(s.charAt(k));
            }
            return str.toString();
        }
        return "";
    }

}
