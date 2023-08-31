package LeetCode;

import java.util.*;

public class LargestValuesFromLabels {
    public static void main(String[] args) {
        System.out.println(largestValsFromLabels(new int[]{9,8,8,7,6}, new int[]{0,0,0,1,1},3,2));
    }
    static class pair{
        int val = 0;
        int label = 0;
        pair(int val, int label){
            this.val = val;
            this.label = label;
        }
    }
    public static int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {

        PriorityQueue<pair> max = new PriorityQueue<pair>((s1, s2) -> {
    if (s1.val < s2.val)
        return 1;
    else if (s1.val > s2.val)
        return -1;
    return 0;
});
        for(int i = 0 ;i < values.length; i++){
            pair p = new pair(values[i],labels[i]);
            max.offer(p);
        }
        int sum = 0;
        HashMap<Integer, Integer> set = new HashMap();
        while(numWanted > 0 && !max.isEmpty()){
            int val = max.peek().val;
            int label = max.poll().label;
            if(set.containsKey(label)){
                if(set.get(label) < useLimit){
                    sum += val;
                    numWanted--;
                    set.put(label, set.get(label) + 1);
                }
            }
            else{
                sum += val;
                set.put(label , 1);
                numWanted--;
            }
        }
        return sum;
    }
}
