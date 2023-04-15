package Sliding_Window;

import java.util.*;
public class FIrstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        System.out.println(first(arr , 2));
    }
    private static List<Integer> first(int [] arr , int k){
        List<Integer> list= new ArrayList<>();
        int start =0 ;
        int end  = 0;
        Queue<Integer> que = new LinkedList<>();
        while(end < arr.length){
            if(arr[end] < 0){
               que.offer(arr[end]);
//                end++;
            }

            if(end - start + 1 < k){
                end++;
            }
            else if(end - start + 1 >= k){
                if(que.peek() != null){
                    list.add(que.poll());
                }
                else{
                    list.add(0);
                }
                start++;
            }
        }
        return list;
    }
}
