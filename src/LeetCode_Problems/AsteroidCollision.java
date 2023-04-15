package LeetCode_Problems;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {-2,-2,1,-2};
        System.out.println(Arrays.toString(check(arr)));
    }
    public static int[] check(int[] can) {
        Stack<Integer> stack = new Stack<>();
        stack.push(can[0]);
        for(int i =1 ; i< can.length; i++){
            if((stack.peek() > 0 && can[i] < 0 ) ){
                int num = can[i];
                boolean one = true;
                if(num < 0 ){
                    one  = false;
                    num = Math.abs(num);
                }
                while(num != 0 && !stack.isEmpty()){
                    int man = stack.peek();
                    boolean two = true;
                    if(man < 0){
                        two = false;
                        man = Math.abs(man);
                    }
                    if(((one && two) && (man == num)) || ((!one && !two) && (man == num))){
                        break;
                    }
                    if(((two && !one) && (man < num)) || (!two && one) && (man < num)){
                        stack.pop();
//                        stack.push(num);
//                        num =0 ;
                    }
                    else if(((two && !one) && (man == num)) || (!two && one) && (man == num)){
                        stack.pop();
                        num = 0;
                    }
                    else{
                        num = 0;
                    }
                }
                if(num != 0){
                    if(one) stack.push(num);
                    else stack.push(-num);
                }

            }
            else{
                stack.push(can[i]);
            }
        }
        int[] result = new int[stack.size()];
        int i = stack.size() -1 ;
        while(!stack.isEmpty()){
            result[i] = stack.pop();
            i--;
        }
        return result;
    }
}
