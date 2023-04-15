package LeetCode_Problems;
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        System.out.println(Arrays.toString((man(nums1,nums2))));
    }
    public static int[] man(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer , Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ; i < nums1.length ; i ++){
            map.put(nums1[i],i);
        }
        for(int i = nums2.length - 1 ; i>= 0; i--){
            int can = nums2[i];
            if(map.containsKey(nums2[i])){

                    int great = -1;
                    while(!stack.isEmpty()){
                        if(can < stack.peek()){
                            great = stack.peek();
                            break;
                        }
                        else{
                            stack.pop();
                        }
                    }
                    result[map.get(can)] = great;
                stack.push(can);
            }
            else{
                stack.push(nums2[i]);
            }
        }
        return result;
    }
}
