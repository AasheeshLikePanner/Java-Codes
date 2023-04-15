package LeetCode_Problems;

import java.util.Stack;

public class BaseBall_GAMe {
    public static void main(String[] args) {
        String[] can = {"5","2","C","D","+"};
        String[] can1 = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(can1));
    }
    public static int calPoints(String[] can) {
        Stack<Integer> first = new Stack<>();
        first.add(Integer.parseInt(can[0]));
        int sum = 0;
        for (int i = 1; i < can.length ; i++) {
            String man = can[i];
            switch (man) {
                case "C" -> first.pop();
                case "D" -> {
                    int num = first.peek();
                    first.add(num * 2);

                }
                case "+" -> {
                    int[] arr = new int[2];
                    arr[0] = first.pop();
                    arr[1] = first.pop();
                    sum = arr[0] + arr[1];
                    first.add(arr[1]);
                    first.add(arr[0]);
                    first.add(sum);
                }
                default -> {
                    int num = Integer.parseInt(man);
                    first.add(num);
                }
            }
        }
        sum = 0;
        while(!first.isEmpty()){
            sum += first.pop();
        }
        return sum;
    }
}
