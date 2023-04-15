import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int key;
    int data;

    Pair(int key, int data) {
        this.key = key;
        this.data = data;
    }

    @Override
    public int compareTo(Pair o) {
        return this.key - o.key;
    }

}
public class Heap {
    public static void main(String[] args) {
        int[] can = {6,5,3,2,8,10,9};
        int[] close = {5,6,7,8,9};
        System.out.println("Implementing max heap " + max(can));
        System.out.println("Implementing min heap " + min(can));
        System.out.println(Arrays.toString(sort(can,3)));
        kClose(close , 3,7);
    }
    static void kClose(int arr[], int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr) {
            maxHeap.add(new Pair(Math.abs(i - x), i));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        while (maxHeap.size() > 0) {
            System.out.print(maxHeap.poll().data + " ");
        }
    }
    static int min(int[] can){
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int man:can) {
            min.offer(man);
        }
        return min.peek();
    }
    static int max(int[] can){
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int man:can) {
            max.offer(man);
        }
        return max.peek();
    }
    static int[] sort(int[] can , int k){
        PriorityQueue<Integer> man = new PriorityQueue<>();
        int[] arr = new int[can.length];
        int index = 0;
        for (int i = 0; i < can.length; i++) {
            if(man.size() > k){
                arr[index]  = man.poll();
                man.offer(can[i]);
                index++;
            }
            else{
                man.offer(can[i]);
            }
        }
        while(!man.isEmpty()){
            arr[index] = man.poll();
            index++;
        }
        return arr;
    }
}
