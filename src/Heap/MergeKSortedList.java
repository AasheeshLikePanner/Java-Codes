package Heap;

import java.util.*;

public class MergeKSortedList {
    public static void main(String[] args) {
        int[] one = {4,3,5};
        int[] two = {6,2,1};
        int[] three = {9,10,8,7};
        System.out.println(sort(one, two, three));
    }
    private static List<Integer> sort(int[] arr1 , int[] arr2 , int[] arr3){
        List<Integer> list= new ArrayList<>();
        PriorityQueue<Integer> result = new PriorityQueue<>();
        for(int num:arr1){
            result.offer(num);
        }
        for(int num:arr2){
            result.offer(num);
        }
        for(int num:arr3){
            result.offer(num);
        }

        while(!result.isEmpty()){
            list.add(result.poll());
        }
        return list;
    }
}
