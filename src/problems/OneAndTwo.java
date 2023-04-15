package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args) {
//
//        int[] test1 = {2,2,1,2,1,2};
//        int[] test2=  {2,2,1,1,1};
//        int[] test3 = {1,1,1,1};
//        int[] test4 = {1,2,1};

        Scanner sc= new Scanner(System.in);
        int l = sc.nextInt();
        int[] array = new int[l];
        for(int i = 0; i< l ; i ++){
            array[i] = sc.nextInt();
        }
        int m = Integer.MAX_VALUE;
        can(array);
        for (int man : list) {
            if(m > man){
                m = man;
            }
        }
        if(list.size() == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(m + 1);
        }
    }
    static List<Integer> list = new ArrayList<>();
    public static void can(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int total = multiply(arr, start , end);
        int mul = 0;
        int sub = 0;
        int part = 0;
        while(start < end){
            int mid = start + (end - start)/2;
            mul = multiply(arr , start , mid);
            part  = total / mul;
            sub =  mul - part;
            if(part == mul){
                list.add(mid);
                end = mid;
            }
            else if(sub < 0 ){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
    }
    public static int multiply(int[] arr , int start , int end){
        int multiply = 1;
        for(int i = start; i <= end ; i++){
            multiply *= arr[i];
        }
        return multiply;
    }
}
