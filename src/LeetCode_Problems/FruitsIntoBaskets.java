package LeetCode_Problems;

import java.util.HashMap;

public class FruitsIntoBaskets {
    public static void main(String[] args) {
        int[] test1 = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(test1));
    }
    public static int totalFruit(int[] fruits) {
        int start = 0;
        int end = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int max = 0;
        while(end < fruits.length){
            if(map.containsKey(fruits[end])){
                map.put(fruits[end] , map.getOrDefault( fruits[end] ,1) + 1);
            }
            else{
                map.put(fruits[end] , 1);
            }
            if(map.size() < 2){
                end++;
            }
            else if(map.size() == 2){
                max = Math.max(max , end - start + 1);
//                start++;
                end++;
            }
            else if(map.size() > 2){
                while(map.size() > 2){
                    if(map.containsKey(fruits[start])){
                        if(map.getOrDefault(fruits[start] , 1 )  == 0){
                            map.remove(fruits[start]);
                        }
                        else{
                            map.put(fruits[start] , map.getOrDefault( fruits[start], 1) - 1);
                            if(map.getOrDefault(fruits[start] , 0) == 0){
                                map.remove(fruits[start]);
                            }
                        }
                    }
                    start++;
                    end++;
                }
            }
        }
        return max;
    }

}
