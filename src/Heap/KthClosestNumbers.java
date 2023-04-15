package Heap;
import java.util.*;
public class KthClosestNumbers {
    public static void main(String[] args) {
        int[] can ={1,2,3,4,5};
        int k = 4;
        int x= 3;
        System.out.println(findClosestElements(can, k ,x));
    }
    static class Pair implements Comparable<Pair>{
        int val;
        int key;
        public Pair(int val , int key){
            this.val = val;
            this.key = key;
        }

        @Override
        public int compareTo(Pair o) {
            if(this.key == o.key)   return this.val-o.val;
            return this.key - o.key;
        }
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> can = new PriorityQueue<>(Collections.reverseOrder());
        for (int j : arr) {
            Pair p = new Pair( j,Math.abs(j - x));
            can.offer(p);
            if (can.size() > k) {
                can.poll();
            }
        }
        while(!can.isEmpty()){
            list.add(can.poll().val);
        }
        Collections.sort(list);
        return list;
    }

}
