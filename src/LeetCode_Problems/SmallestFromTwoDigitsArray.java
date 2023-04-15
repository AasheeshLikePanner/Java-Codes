package LeetCode_Problems;

public class SmallestFromTwoDigitsArray {
    public static void main(String[] args) {
        int[] arr=  {6,4,3,7,2,1,8,5};
        int[] arr1 = {6,8,5,3,1,7,4,2};
        System.out.println(minNumber(arr , arr1));
    }
    public static int minNumber(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int test = 0;
        int num = 1;
        for(int i =0 ; i < nums1.length ; i++){
            for(int j =0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]) test = nums2[i];
                    else{test = Math.min(nums1[i]*10 + nums2[j] , nums2[j]*10 + nums1[i]);}
                    min = Math.min(test , min);
            }
        }
        return min;
    }
}
