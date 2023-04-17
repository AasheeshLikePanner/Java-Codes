package LeetCode_Problems;

import java.util.*;

public class KidsWithGreatestCandeis {
    public static void main(String[] args) {

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list= new ArrayList<>();
        int max = 0;
        for(int can : candies){
            max = Math.max(max, can);
        }
        for(int can: candies){
            if(can+extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }

}
