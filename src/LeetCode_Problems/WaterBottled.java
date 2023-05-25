package LeetCode_Problems;

public class WaterBottled {
    public static void main(String[] args) {
        System.out.println(man(9,3));
    }
    public static int man(int a, int b) {
        int result = a;
        int bottle  = a;
        while(bottle != 0){
            int rem = bottle / b;
            int left = bottle % b;
            result += rem;
            bottle = left + rem;
            if(bottle < b){
                return result;
            }
        }
        return result;
    }
}
