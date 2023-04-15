package LeetCode_Problems;

public class MinimumSpeedToArrive {
    public static void main(String[] args) {
        int[] can = {1,1,100000};
        System.out.println(minSpeedOnTime(can,2.01));
    }
    public static int minSpeedOnTime(int[] dist, double hour) {
        double ans = 0;
        double start = 0;
        double end = Integer.MAX_VALUE;
        while(start <= end){
            double mid = start + (end - start)/2;
            boolean result = check(dist, hour, mid);
            if(result){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return (int)ans;
    }
    private static boolean check(int[] can , double hour , double mid){
        if(mid == 0){
            return false;
        }
        double sum = 0;
        for(int i = 0; i < can.length - 1;i++){
            sum += Math.ceil(can[i]/mid);
        }
        sum += can[can.length - 1]/mid;
        if(sum > hour){
            return false;
        }
        return true;
    }
}
