package LeetCode_Problems;

import java.util.HashMap;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        String s = "abacaba";
        String s1 = "ssssss";
        System.out.println(partitionString(s1));
    }
    public static int partitionString(String s) {
        int count = 0;
        HashMap<Character ,Integer> map = new HashMap<>();
        int i =0 ;
        for(int j = 0;  j < s.length() ; j++){
            char ch =s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch , 1);
                j++;
            }
            else if(map.containsKey(ch)){
                map.clear();
                i = j;
                count+=1;
            }
        }
        return count + 1;
    }
}
