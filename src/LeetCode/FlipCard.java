package LeetCode;

import java.util.HashSet;

public class FlipCard {
    public static void main(String[] args) {

    }
    public int flipgame(int[] fronts, int[] backs) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i < fronts.length; i++){
            if(fronts[i] == backs[i]){
                set.add(fronts[i]);
            }
        }
        int min = 2001;
        for(int i = 0; i < fronts.length; i++){
            if(!set.contains(fronts[i])){
                min = Math.min(fronts[i], min);
            }
            if(!set.contains(backs[i])){
                min = Math.min(backs[i], min);
            }
        }
        return min;
    }
}
