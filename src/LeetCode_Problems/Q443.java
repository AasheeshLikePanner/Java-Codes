package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class Q443 {
    public static void main(String[] args) {

    }
    public static int compress(char[] chars) {
        List<Character> result = new ArrayList<>();
        int index = 0;
        int start = 0;
        int end = chars.length - 1;
        int pos = 0;
        while(pos != chars.length){
            int mid = start + (end - start)/2;
            char ch = chars[pos];
            if(mid > 0 && (ch == chars[mid] && chars[mid] == chars[mid -1])){
                result.add(ch);
                result.add((char)mid);
                pos = mid + 1;
            }
            else if(mid < chars.length - 1 &&(ch == chars[mid] && chars[mid] == chars[mid +1])){
                start = mid +1;
            }
        }
        return result.size();
    }
}
