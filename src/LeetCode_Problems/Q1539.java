package LeetCode_Problems;

public class Q1539 {
    public static void main(String[] args) {
        int[] can = {2,3,4,7,11};
        int[] can2 = {1,2,3,4};
//        System.out.println(findKthPositive(can , 5));
        System.out.println(findKthPositive(can2 , 2));
    }
    public static int findKthPositive(int[] arr, int k) {
        int ans = -1;
        int temp = 1;
        int i = 0;
        while(i < arr.length){
            if(temp != arr[i]){
                while(temp != arr[i]){
                    if(k == 0){
                        return ans;
                    }
                    ans = temp;
                    temp++;
                    k--;
                }
            }
            temp++;
            i++;
        }
        if(ans == -1){
            return arr[i - 1] + k;
        }
        return ans;
    }
}
