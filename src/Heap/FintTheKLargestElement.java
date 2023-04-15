package Heap;

import java.util.*;

public class FintTheKLargestElement {
    public static void main(String[] args) {
        int[] arr= {2,10,5,17,7,18,6,4};
        System.out.println(largest(arr , 3));
    }
    public static List<Integer> largest(int[] arr , int k){
        PriorityQueue<Integer>min = new PriorityQueue<>();
        List<Integer> result  = new ArrayList<>();
        for(int can: arr){
            min.offer(can);
            if(min.size()>k){
                min.poll();
            }
        }
        while(!min.isEmpty()){
            result.add(min.poll());
        }
        return result;
    }
}
