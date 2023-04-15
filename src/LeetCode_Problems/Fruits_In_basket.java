package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class Fruits_In_basket {
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        int max = totalFruit(fruits);
        System.out.println(max);
    }
    public static int totalFruit(int[] fruits) {
        List<Integer> list = new ArrayList<>();
        for(int can: fruits){
            if(!list.contains(can)){
                list.add(can);
            }
        }
        List<Integer> count = new ArrayList<>();
        for(int i = 1; i < list.size() ; i++){
            count.add(helper(fruits , list.get(i - 1) , list.get(i)));
        }
        int max = 0;
        for (int man:count) {
            if(max < man){
                max = man;
            }
        }
        return max;
    }
    public static int helper(int[] fruits , int first , int second ){
        int count = 0;
        for(int i = 0; i< fruits.length ; i++){
            if(fruits[i] == first || fruits[i] == second){
                count++;
            }
            else{
                return count;
            }
        }
        return count;
    }
}
