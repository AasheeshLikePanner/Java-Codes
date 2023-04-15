package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class Remove_K_digits {
    public static void main(String[] args) {
        String man = removeKdigits("10200",1 );
        System.out.println(man);
    }

    public static String removeKdigits(String num, int k) {
        helper("", num , num.length() - k);
        int m =  Integer.MAX_VALUE;
        for(int can: list){
            if(m > can){
                m = can;
            }
        }
        return Integer.toString(m);
    }
    static List<Integer> list = new ArrayList<>();
    public static void helper(String p ,String can , int k){
        if(k == 0){
            int num = 0;
            for(int i = 0 ; i < p.length() ; i++){
                char ch = p.charAt(i);
                if(ch == '0'){
                    num = num * 10;
                }
                else{
                    num = num * 10 + (int)(ch%49 + 1);
                }
            }
            list.add(num);
            return;
        }
        if(can.length() == 0){
            return;
        }
        char ch = can.charAt(0);
        helper( p+ch , can.substring(1) , k - 1);
        helper(p , can.substring(1), k);
    }
}
