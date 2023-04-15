package LeetCode_Problems;

import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String s1 = "  hello world  ";
        String s2 = "a good   example";
        System.out.println(reverseWords(s2));
    }
    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        int start = 0;
        int end =0;
        if(s.charAt(s.length() - 1) != ' '){
            s+=' ';
        }
        end = s.length();
        String temp = s;
        while(start < end){
            while(s.charAt(start) == ' '){
                start++;
                if(start >= end){
                    break;
                }
            }
//            s.substring(start , end);
            s = s.substring(start , end);
            start = 0;
            end = s.indexOf(' ');
            if(end == -1){
                break;
            }
            stack.add(s.substring(start , end));
            start = end + 1;
            end = s.length();
        }
        if(!s.isEmpty()){
            if(s.charAt(0) == ' '){
                s = s.substring( 1);
            }
            if(s.charAt(s.length() - 1) == ' '){
                s = s.substring( 0, s.length() -1);
            }
        }
        String result = "";
        while(!stack.isEmpty()){
            result += stack.pop() + ' ';
        }
        result = result.substring( 0, result.length());
        return result;
    }
}
