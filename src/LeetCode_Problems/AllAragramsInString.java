package LeetCode_Problems;

import java.util.*;
public class AllAragramsInString {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character , Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        for(char ch:p.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }
            else{
                map.put(ch , 1);
            }
        }
        count = map.size();
        char[] arr = s.toCharArray();
        int k = p.length();
        List<Integer> list = new ArrayList<>();
        while(j < arr.length){
            if(map.containsKey(arr[j])){
                map.put(arr[j] , map.get(arr[j] - 1));
                if(map.get(arr[j]) == 0){
                    count--;
                }
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(count == 0){
                    list.add(i);
                }
                if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i]) + 1);
                    if(map.get(arr[i]) >= 1){
                            count++;
                    }
                }
                i++;
                j++;
            }
        }
        return list;
    }
}
