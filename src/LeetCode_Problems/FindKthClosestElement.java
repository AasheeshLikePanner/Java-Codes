package LeetCode_Problems;
import java.util.*;
public class FindKthClosestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4, x = 3;
        System.out.println(Arrays.toString(findClosestElements(arr,k,x)));
    }
    public static int[] findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] - x > 0) {
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        int index = end;
        boolean flag = true;
        int[] can = new int[k];
        int i =0;
        List<Integer> list = new ArrayList<>();
        while(k != 0){
            if(index < 0 ){
                index = start + 1;
                flag = false;
            }
            if(flag) {
                list.add(arr[index]);
                i++;
                index--;
                k--;
            }
            else if(!flag){
                list.add(arr[index]);
                i++;
                index++;
                k--;
            }
        }
        Collections.sort(list);

        return can;

    }
}
