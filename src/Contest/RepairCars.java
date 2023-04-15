package Contest;

public class RepairCars {
    public static void main(String[] args) {
        int[] rank = {4,2,3,1};
        int car = 10;
        System.out.println(repairCars(rank ,car));
    }
    public static long repairCars(int[] ranks, int cars) {
        long start = 1;
        long end = 0;
        int max = 0;
//        for (int can:ranks) {
//            start = Math.min(can ,start);
//        }
//        end = Integer.MAX_VALUE;
        end = Long.MAX_VALUE;
        long ans = 0;
        while(start < end){
            long mid = (end + start)/2;
            int time = helper(ranks, mid);
            if(time < 0 ){
                break;
            }
            if(time < cars){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid;
            }
        }
        return start;
    }
    public static int helper(int[] ranks ,long mid){
        int ans = 0;
        long num =0;
        int n = 1;
        for(int can : ranks){
            num = can;
            while(num <= mid){
                num = num * n * n;
                n += 1;
                if(num >  mid) break;
                if(num <= mid){
                    ans+=1;
                }
                num = can;
            }
            n = 1;
        }
        return ans;
    }
}
