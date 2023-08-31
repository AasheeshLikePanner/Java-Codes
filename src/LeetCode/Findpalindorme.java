package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Findpalindorme {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getPalindromes(1698)));
    }
    public static int[] getPalindromes(int n) {
        List<Integer> list = new ArrayList<>();
        long val = 11;
        long cur = 100;
        for(int i = 1; i < n && i <= 9; i++){
                list.add(i);
        }
//        for(int i = 11; i <= n; i += val ) {
            long i = 11;
            while(i <= n) {
                list.add((int)i);
                if (i % 10 == 9) {
                    String s = String.valueOf(val);
//                    int val =
                    s.replace('9', '1');
                    s = s.substring(0, 1) + '0' + s.substring(1);
                    val = (int) Long.parseLong(s);
                    i = val;
                }
                else{
                    i += 10;
                }
            }
//        }
        int[] arr= new int[list.size()];
        for(int j = 0;j < list.size(); j++){
            arr[j] = list.get(j);
        }
        return arr;
    }
}
