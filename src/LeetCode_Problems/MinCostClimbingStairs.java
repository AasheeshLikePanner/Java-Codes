package LeetCode_Problems;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] can1= {10,15,20};
        int[] can2 = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(can2));
    }
    public static int minCostClimbingStairs(int[] cost) {
        return Math.min(one(cost , 0 , 0) , two(cost , 0 , 1));
    }
    private static int one(int[] cost, int sum , int index){
        if(index == cost.length - 1){ sum+= cost[index]; return sum;}
        if(index >= cost.length){
            return sum;
        }
        int one = one(cost , sum + cost[index],index + 1);
        int two = one(cost , sum + cost[index] , index + 2);
        return Math.min(one, two);
    }
    private static int two(int[] cost, int sum , int index){
        if(index == cost.length - 1){ sum+= cost[index]; return sum;}
        if(index >= cost.length){
            return sum;
        }
        int one = two(cost , sum + cost[index],index +1);
        int two = two(cost , sum + cost[index] , index + 2);
        return Math.min(one, two);
    }

}
