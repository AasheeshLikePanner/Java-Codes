package LeetCode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
    }
    public static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[0] < target && nums[mid] > target){
                e = mid - 1;
            }
            else if(nums[0] < target && nums[mid] < target){
                s = mid + 1;
            }
            else if(nums[mid]  < target  && nums[nums.length - 1] < target){
                s = mid + 1;
            }
            else{
                e = mid  - 1;
            }
        }
        if(nums[s] != target){
            return -1;
        }
        return nums[s];
    }
}
