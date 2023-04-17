package Contest;

public class DivisiblityScore {
    public static void main(String[] args) {
            int[] can ={31,91,47,6,37,62,72,42,85};
            int[] am ={95,10,8,43,21,63,26,45,23,69,16,99,92,5,97,69,33,44,8};
        System.out.println(maxDivScore(can,am));
    }
        public static int maxDivScore(int[] nums, int[] divisors) {
            int count = 0;
            int max = 0;
            int ans = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < divisors.length ; i++){
                int can = man(nums,divisors[i]);
                if(can > max){
                    ans = divisors[i];
                }
                if(can == max){
                    ans = Math.min(ans , divisors[i]);
                }
                min = Math.min(min , divisors[i]);
                max = Math.max(max, can);
            }
            if(ans == 0){
                return min;
            }
            return ans;
        }
        public static int man(int[] can , int target){
            int count = 0;
            for(int i =0 ; i < can.length; i++){
                if(can[i]%target == 0 ){
                    count++;
                }
            }
            return count;
        }
}
