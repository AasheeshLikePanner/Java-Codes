package LeetCode_Problems;

public class LengthAfterRemovingSubstring {
    public static void main(String[] args) {
        String s = "ABDCD";
        s = s.replace("AB", "");
        System.out.println(s);
    }
    public int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")){
           if(s.contains("AB")){
               s = s.replace("AB", "");
           }
            if(s.contains("CD")){
                s = s.replace("CD", "");
            }
        }
        return s.length();
    }
}
