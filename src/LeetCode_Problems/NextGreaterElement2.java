package LeetCode_Problems;

import java.util.*;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] can1 = {1,2,3,2,1};
        System.out.println(Arrays.toString(man(can1)));
    }
    public static int[] man(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        Stack<Integer> stack= new Stack<>();
        for(int i = nums.length - 1; i>= 0 ; i--){
            int can = nums[i];
            if(stack.isEmpty() && index < i){
                int ans = -1;
                while(true){
                    if(index == i){

                        break;
                    }
                    if(nums[index] > can){
                        ans = nums[index];
                        break;
                    }
                    else{
                        index++;
                    }
                }

                stack.push(ans);
                stack.push(can);
                result[i] = ans;
            }
            else{
                int ans =  -1;
                while(!stack.isEmpty()){
                    if(can < stack.peek()){
                        ans = stack.peek();
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(ans == - 1 && (stack.isEmpty() && index < i)){
                    while(true){
                        if(index == i){

                            break;
                        }
                        if(nums[index] > can){
                            ans = nums[index];
                            break;
                        }
                        else{
                            index++;
                        }
                    }

                    stack.push(ans);
                    stack.push(can);
                    result[i] = ans;
                }
                stack.push(can);
                result[i] = ans;
            }
        }
        return result;
    }

}
