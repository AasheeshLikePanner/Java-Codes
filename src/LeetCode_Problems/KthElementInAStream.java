package LeetCode_Problems;

import java.util.ArrayList;
import java.util.*;
public class KthElementInAStream {
    public static void main(String[] args) {

    }
    public void KthLargest(int k, int[] nums) {
        element = k;
        for(int num:nums){
            list.add(num);
        }
    }
    List<Integer> list= new ArrayList<>();
    int element = 0;

    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - element);
    }
}
