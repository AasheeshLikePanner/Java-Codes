package LeetCode_Problems;

import java.util.*;

//Input
//["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"]
//[[], [2], [], [], [], [1], [], [], []]
public class SmallestInINfiniteSet {
    public static void main(String[] args) {
        SmallestInfiniteSet small = new SmallestInfiniteSet();
        small.addBack(2);
        System.out.println(small.popSmallest());
        System.out.println(small.popSmallest());
        System.out.println(small.popSmallest());
        small.addBack(1);
        System.out.println(small.popSmallest());
        System.out.println(small.popSmallest());
        System.out.println(small.popSmallest());
    }
}
    class SmallestInfiniteSet {
        HashMap<Integer , Integer> map;
        PriorityQueue<Integer> que;
        int  num = 1;
        public SmallestInfiniteSet() {
            map = new HashMap<>();
            que = new PriorityQueue<>();
        }
        public int popSmallest() {
            if(!que.isEmpty() && que.peek() < num){
                if(map.containsKey(que.peek())){
                    map.remove(que.peek());
                }
                return que.poll();
            }else{
                int res = num;
                num++;
                return res;
            }
        }

        public void addBack(int num) {
            if(num < this.num && !map.containsKey(num)){
                que.add(num);
                map.put(num , 1);
            }
        }
    }

