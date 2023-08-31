package Contest;

import java.util.ArrayList;
import java.util.List;

public class StringAcronym {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("charlie");
        System.out.println(isAcronym(list,"abc"));
    }
    public static boolean isAcronym(List<String> words, String s) {
        int j = 0;
        if(words.size() != s.length()){
            return false;
        }
        for(String word:words){
            if(!word.startsWith(String.valueOf(s.charAt(j++)))){
                return false;
            }
        }
        return true;
    }
}
