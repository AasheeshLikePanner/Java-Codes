package Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class pracitse {
    public static void main(String[] args) {
        int[] arr = {4,2,5,1,3};
        PriorityQueue<Integer> max = new PriorityQueue<>();
        for (int can:arr) {
            max.offer(can);
        }
        while(!max.isEmpty()){
            System.out.print(max.poll() + " -> ");
        }
//        System.out.println("END");
//        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
//        for (int can:arr) {
//            min.offer(can);
//        }
//        while(!min.isEmpty()){
//            System.out.print(min.poll() + " -> ");
//        }
//        System.out.println("END");
//        for (int can:arr) {
//            min.offer(can);
//        }
//        min.remove(5);
//        min.remove(3);
//        while(!min.isEmpty()){
//            System.out.print(min.poll() + " -> ");
//        }
    }
}
