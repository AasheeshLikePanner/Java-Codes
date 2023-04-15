package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int[] can = {1,2,0,0};
        List<Integer> list = addToArrayForm(num,34);
        System.out.println(list);

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        List<Integer> list = new ArrayList<>();
        int sum = 0;
       int temp = k;
       int rem = 0;
       int store = 0;
        for(int i = num.length - 1;i >= 0 ; i--){
            rem = temp %10;
            sum = num[i] + carry + rem;
            temp= temp / 10;
            if(sum > 9){
                store = sum %10;
                list.add(0,store);
                carry = 1;
            }
            else{
                list.add(0, sum);
                carry = 0;
            }
        }
        return list;
    }
}
