package LeetCode_Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2 {
    public static void main(String[] args) {

    }
    public String predictPartyVictory(String senate) {
        Queue<Integer> one = new LinkedList<>();
        Queue<Integer> two = new LinkedList<>();
        char[] arr = senate.toCharArray();
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            if(ch == 'D'){one.offer(i);}
            else two.offer(i);
        }
        while(!one.isEmpty() && !two.isEmpty()){
            int d = one.poll();
            int r = two.poll();
            if(d > r){
                two.offer(r+ arr.length);
            }
            else{
                one.offer(d + arr.length);
            }
        }
        return (one.size() > two.size())? "Dire":"Radient";
    }
}
