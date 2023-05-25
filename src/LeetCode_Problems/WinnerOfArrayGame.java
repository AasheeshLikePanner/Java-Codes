package LeetCode_Problems;

import java.lang.reflect.Array;

public class WinnerOfArrayGame {
    public static void main(String[] args) {
//        int[]  arr = {2,1,3,5,4,6,7}; int k = 2;
        int[] arr = {3,2,1}; int k = 10;
        System.out.println(getWinner(arr , k));
    }
    public static int getWinner(int[] arr, int k) {
        if(k >= arr.length){
            int max = 0;
            for(int num : arr){
                max = Math.max(max , num);
            }
            return max;
        }
        int count = 0;
        int i = 0;
        int j = 1;
        int win = arr[0];
        boolean flag = true;
        while(true){
            if(count == k){
                if(flag)    return arr[i];
                else    return arr[j];
            }
            if(j == arr.length)     j = 0;
            if(i == j){
                j++;
            }
            if(arr[i] > arr[j]){
                if(win == arr[i]){
                    count++;
                }
                else{
                    count = 1;
                }
                win = arr[i];
                j++;

            }
            else if(arr[i] < arr[j]){
                if(win == arr[j]){
                    count++;
                }
                else{
                    count = 1;
                }
                win = arr[j];
                i = j;
                j++;

            }
        }
    }
}
