package LeetCode;

public class PartitionArrayAccordingtoGivenPivot {
    public static void main(String[] args) {

    }
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int i = 0;
        int count  = 0;
        for (int k : nums) {
            if (k == pivot) {
                count++;
            }
            if (k < pivot) {
                res[i++] = k;
            }

        }
        while (count-- > 0) res[i++] = pivot;
        for (int num : nums) {
            if (num > pivot) {
                res[i++] = num;
            }
        }
        return res;
    }
}
