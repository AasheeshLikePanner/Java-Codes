package LeetCode_Problems;

public class LexographicallyPalindrome {
    public static void main(String[] args) {
        String s = "ABCD";
//        System.out.println(s.substring(1));
        System.out.println(palin("abcd"));
    }
    public static String palin(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                if((int)s.charAt(start) < (int)s.charAt(end)){
                    s = s.substring(0,end ) + s.charAt(start) + s.substring(end + 1);
                }
                else if((int)s.charAt(start) >= (int)s.charAt(end)){
                    s = s.substring(0, start) + s.charAt(end) + s.substring(start + 1);
                }
            }
            start++;
            end--;
        }
        return s;
    }
}
