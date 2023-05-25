package LeetCode_Problems;

public class MergeStrings {
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(man(word1 , word2));

    }
    public static String man(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i =0;
        int j = 0;
        while(i < word1.length() || j < word2.length()){
            if(i < word1.length()){
                result.append(word1.charAt(i));
                i++;
            }
            if(j < word2.length()){
                result.append(word2.charAt(j));
                j++;
            }
        }
        return result.toString();
    }
}
