package LeetCode;
import java.util.*;
public class MakeArrayStrictlyIncreasing {
    public static void main(String[] args) {
        System.out.println(makeArrayIncreasing(new int[]{0,11,6,1,4,3}, new int[]{5,4,11,10,1,0}));
    }
    public static int makeArrayIncreasing(int[] arr1, int[] arr2) {
        int res = 0;
        Arrays.sort(arr2);
        int prev = arr1[0];
        for(int i =0 ; i< arr1.length  - 1; i++){
            if(arr1[i] >= arr1[i + 1]){
                int j = binary(arr2, Math.abs(arr1[i + 1] - prev));
                arr1[i] = arr2[j];
                res++;
            }
            else if(i > 0 && arr1[i] == arr2[i - 1]){
                int j = binary(arr2, Math.abs(arr1[i + 1] - prev + 1));
                arr1[i] = arr2[j];
                res++;
            }
            prev = arr1[i];
        }
        for(int i =0 ; i < arr1.length - 1; i++){
            if(arr1[i] >= arr1[i + 1]){
                return -1;
            }
        }
        return res;
    }
    public static int binary(int[] arr, int target){
        int s = 0;
        int e = arr.length;
        while(s < e){
            int mid = s + (e - s)/2;
            if(arr[mid] >= target){
                e = mid;
            }
            else{
                s = mid + 1;
            }
        }
        return s;
    }
}