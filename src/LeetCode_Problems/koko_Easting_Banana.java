package LeetCode_Problems;

public class koko_Easting_Banana {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int[] piles2 = {3,6,7,11};
        int[] piles3 = {805306368,805306368,805306368};
        System.out.println(minEatingSpeed(piles3,1000000000));
    }
    public static int minEatingSpeed(int[] piles, int h) {         // piles = [3,6,7,11], h = 8
        int start = 1;
        int end = getMaxPile(piles);
        int ans = 0;
        while(start <= end){
            int mid = (end + start)/2;
            int time = helper(piles, mid);
            if(time < 0 ){
                break;
            }
            if(time > h){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    private static int getMaxPile(int[] piles) {
        int maxPile = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxPile = Math.max(pile, maxPile);
        }
        return maxPile;
    }

    private static int helper(int[] piles, int mid) {
        int count = 0;
        for (int pile : piles) {

            count += pile/mid;
            if (pile % mid != 0) {
                count++;
            }
        }
        return count;
    }
}
