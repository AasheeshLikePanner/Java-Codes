package LeetCode_Problems;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String can1  = "/home//aniket";
        String can2 =  "/../";
        String can3 = "/home/";
        String can4 = "/a/./b/../../c/";

        System.out.println(simplifyPath(can4));

    }
    public static String simplifyPath(String path) {
        StringBuilder s = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for(String word: arr){
            if(word.equals("..")){
                while(stack.size() != 1)    {
                    stack.pop();
                }
            }
            else if (!word.isEmpty() && !word.equals(".")){
                stack.push(word.substring(0));
            }
        }
        while(!stack.isEmpty()){
            s.insert( 0, "/" + stack.pop());
//            s.append("/").append(stack.pop());
        }
//        s.reverse();
        return s.toString();
    }
}