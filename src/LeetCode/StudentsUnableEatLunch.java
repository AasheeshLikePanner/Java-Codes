package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class StudentsUnableEatLunch {
    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{1,1,1,0,0,1},new int[]{1,0,0,0,1,1}));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int one = 0;
        int zero = 0;
        for(int n : students){
            if(n == 1){
                one++;
            }
            else {
                zero++;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        int i  =0 ;
        int j  =0;
        while(set.size() != students.length && j != sandwiches.length){
            if(zero == 0 && students[i] != sandwiches[j] && sandwiches[j] == 0){
                return one;
            }
            else if(one == 0 && students[i] != sandwiches[j] && sandwiches[j] == 1){
                return zero;
            }
            if(!set.contains(i) && students[i] == sandwiches[j]){
                set.add(i);
                if(sandwiches[j] == 1) one--;
                else zero--;
                i++;
                j++;
                if(i == students.length) i = 0;
            }
            else {
                i++;
                if(i == students.length) i = 0;
            }
        }
        return 0;
    }
}
