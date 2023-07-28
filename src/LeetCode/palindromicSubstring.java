package LeetCode;

public class palindromicSubstring {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
    public static int countSubstrings(String s) {
        subset(s, new StringBuilder(), 0);
        return count;
    }
    static int count = 0;
    public static void subset(String s, StringBuilder set, int index){
        if(index == s.length()){
            if(set.length() == 0){
                return;
            }
            String c = set.toString();
            System.out.print(set + " -> ");
            if(c.contentEquals(set.reverse())){
                count++;
            }
            return;
        }
        subset(s, new StringBuilder(set),index + 1);
        set.append(s.charAt(index));
        subset(s,new StringBuilder(set), index + 1);
        }
    }
