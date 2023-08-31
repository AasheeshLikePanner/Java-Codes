package LeetCode;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

public class ReorganizeString {
    public static void main(String[] args) {
        System.out.println(reorganizeString("baaba"));
    }
    public static String reorganizeString(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<Character> max = new PriorityQueue<>((a , b) -> map.get(a) - map.get(b));

            StringBuilder res = new StringBuilder();
            while(max.size() > 2){
                char one = max.poll();
                char two = max.poll();
                res.append(one);
                res.append(two);
                if(map.get(one) == 1){
                    map.remove(one);
                }
                else{
                    map.put(one, map.get(one));

                }
                if(map.get(two) == 1){
                    map.remove(two);
                }
                else{
                    map.put(one, map.get(two));
                }
                max.offer(one);
                max.offer(two);
            }
               if(!max.isEmpty()){
                   char one = max.poll();
                   res.append(one);
                   if(map.get(one) > 1){
                       return "";
                   }
               }
        return res.toString();
    }
}
