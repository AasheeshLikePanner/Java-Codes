package Heap;

import java.util.*;
public class SortANearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,7,5,8,9};
        System.out.println(sort(arr,2));
    }
    private static List<Integer> sort(int[] arr ,int k){
        List<Integer> list  = new ArrayList<>();
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int can:arr){
            que.offer(can);
            if(que.size() > k){
                list.add(que.poll());
            }
        }
        while(!que.isEmpty()){
            list.add(que.poll());
        }
        return list;
    }
}
