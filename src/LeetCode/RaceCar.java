package LeetCode;

public class RaceCar {
    public static void main(String[] args) {
        System.out.println(racecar(3));
    }
    public static int racecar(int target) {
        return helper(target, 1);
    }

    private static int helper(int target, int speed) {
        if(target == 0){
            return 0;
        }
        if(target < 0)return 0;
        int one = (int)1e9;
        if(speed > 0){
            one = helper(target - speed, speed * 2)+ 1;
        }
        int two = (int) 1e9;
        if(speed > 0 ){
            two = helper(target, speed - 1) + 1;
        }
        else{
            two = helper(target, 1);
        }
        return Math.min(two, one);
    }
}

