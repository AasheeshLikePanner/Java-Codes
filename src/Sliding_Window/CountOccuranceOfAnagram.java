package Sliding_Window;

import java.util.HashMap;

public class CountOccuranceOfAnagram {
    public static void main(String[] args) {

    }
    private static int anagram(String s , String an){
        char[] ch = s.toCharArray();
        char[] ch2 = an.toCharArray();
        HashMap<Character , Integer> target = new HashMap<>();
        HashMap<Character, Integer> check = new HashMap<>();
        for (char can:ch2) {
            if(target.containsKey(can)){
                int one = target.get(can);
                target.put(can, one+1);
            }else{
               target.put(can,1);
            }
        }
        int start =0 ;
        int end = 0;
        int count =0;
        while(end < ch.length){
            char can = ch[end];
            if(!target.containsKey(can)){
                check.clear();
                start = end + 1;
                end +=1;
            }
            if(!target.containsKey(can)){
                check.clear();
                start = end + 1;
                end +=1;
            }
//            if(end - start + 1 == ch2.length){
//                if(){
//
//                }
//            }
            if(check.containsKey(can)){
                int one = target.get(can);
                target.put(can, one+1);
            }else {
                target.put(can,1);
            }
            if(end - start + 1 == ch2.length){

            }
            if(end  - start + 1 < ch2.length){
                end++;
            }
        }
        return count;
    }
}
