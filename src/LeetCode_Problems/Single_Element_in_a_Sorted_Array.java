package LeetCode_Problems;

public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[] can = {1,2,2,3,3};
        int[] test1 = {0,1,1,2,2,5,5};
        int[] test2 = {1,1,2,3,3,4,4,8,8};
        int man = singleNonDuplicate(test2);
        System.out.println(singleNonDuplicate(test1));
        System.out.println(singleNonDuplicate(can));
        System.out.println(man);
    }
    public static int singleNonDuplicate(int[] nums) {     //  0 , 1 , 1 , 2 , 2 , 5 , 5
        int  left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            int rem = ((right - mid)%2);
            if(mid > 0 && ((nums[mid - 1] == nums[mid] ) && (rem == 0))){
                right = mid;
            }
            else if(mid > 0 && ((nums[mid - 1] == nums[mid]) && (rem == 1))){
                left = mid +1;
            }
            else if(nums[mid + 1] == nums[mid] && rem == 0){
                left = mid + 1;
            }
            else if(nums[mid + 1] == nums[mid] && rem == 1){
                right = mid - 1;
            }
            else{
                right = mid;
            }

        }
        return nums[right];
    }
}
