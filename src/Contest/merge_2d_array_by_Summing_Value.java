package Contest;

public class merge_2d_array_by_Summing_Value {

    public static void main(String[] args) {

    }
//        if(nums1[i][0] == nums2[i][0]){
//        sum = nums1[i][1] + nums2[i][1];
//        newArray[i][0] = sum;
//        newArray[i][0] = nums1[i][0];
//    }
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        boolean[] flag = new boolean[nums1.length];
        int l1 = nums1.length;
        int l2 = nums2.length;
        int n = 0;
        if(l1 > l2){
            n = l1;
        }
        else{
            n = l2;
        }
        int sum = 0;
        int[][] newArray = new int[l1][2];
        for(int i = 0 ; i < n ; i++){

        }
        return newArray;
    }
}
