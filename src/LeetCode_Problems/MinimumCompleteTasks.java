package LeetCode_Problems;

import java.util.HashMap;

public class MinimumCompleteTasks {
    public static void main(String[] args) {
        int[] tasks = {69,65,62,64,70,68,69,67,60,65,69,62,65,65,61,66,68,61,65,63,60,66,68,66,67,65,63,65,70,69,70,62,68,70,60,68,65,61,64,65,63,62,62,62,67,62,62,61,66,69};
        System.out.println(minimumRounds(tasks));
    }
    public static int minimumRounds(int[] tasks) {
        int count =0 ;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : tasks){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int can:map.values()){
            if(can == 1){
                return -1;
            }
            else if(can % 3 == 0){
                count += can /3;
            }
            else if(can % 2 == 0 || can%2 != 0){
                count += (can /3) + 1;
            }

        }
        return count;
    }
}
