package LeetCode_Problems;

import java.util.*;
public class Combinations {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> outer = new ArrayList<>();
        genrate(1, n , new ArrayList<Integer>() , outer , k);
        return outer;
    }

    private void genrate(int start, int n, List<Integer> inner, List<List<Integer>> outer, int k) {
        if(inner.size() == k){
            outer.add(new ArrayList<>(inner));
            return;
        }
        for(int i = start; i <= n; i++){
            inner.add(i);
            genrate(i + 1,n ,inner , outer, k);
            inner.remove(inner.size() - 1);
        }
    }

}
