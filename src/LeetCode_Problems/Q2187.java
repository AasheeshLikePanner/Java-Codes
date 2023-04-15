package LeetCode_Problems;

public class Q2187 {
    public static void main(String[] args) {
        int[] test1= {5,10,10};
        int[] test2 = {1,2,3,4};
        System.out.println(minimumTime(test2 , 3));
        System.out.println(minimumTime(test1 , 9));
    }
    public static long minimumTime(int[] time, int totalTrips) {
        long start = 0;
        long end = Long.MAX_VALUE;
        while(start <=  end){
            long mid = start + (end - start)/2;
            if(trip(time , mid , totalTrips)){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    private static boolean trip(int[] time , long mid , int ten){
        long t = 0;
        for(int i:time){
            t = t+mid/i;
        }
        if(t <= ten){
            return true;
        }
        return false;
    }
    //        while(mid != 0){
//            for(int i = index ; i >= 0; i-- ){
//                man[i] +=1;
//                total += man[i];
//            }
//            if(total <= ten){
//                return true;
//            }
//            mid--;
//            index++;
//            total = 0;
//        }
}
