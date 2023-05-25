package LeetCode_Problems;

public class MinimumInsertionPalindrome {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(minInsertions(s));
    }
    public static int minInsertions(String s) {
        int start = 0;
        int end = s.length();
        int count = 0;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                start++;
                count++;
            }
        }
        return count;
    }
}
