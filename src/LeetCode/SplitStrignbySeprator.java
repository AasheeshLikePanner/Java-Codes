package LeetCode;

import java.util.*;

public class SplitStrignbySeprator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one.two.three");
        list.add(".six.");
        System.out.println(splitWordsBySeparator(list, '.'));
    }
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>  res = new ArrayList<>();
        for(String word : words){
            StringBuilder s =new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == separator){
                    if(s.length() >= 1){
                        res.add(s.toString());
                        s.setLength(0);
                    }
                }
                else{
                    s.append(word.charAt(i));
                }
            }
            if(s.length() >= 1) res.add(s.toString());
        }
        return res;
    }
}
