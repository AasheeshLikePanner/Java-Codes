package LeetCode_Problems;

import java.util.HashMap;

public class ContainsDuplicatesII {
    public static void main(String[] args) {
        int[] car = {1,2,3,1};  // 3
        int[] ca = {1,2,3,1,2,3};   //2
        int[] ca1 = {1,0,1,1};  //1
        int[] ca2=  {1,2,3,4,5,6,7,8,9,9};  //3
        System.out.println(containsNearbyDuplicate(ca2,3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i =0 ;
         int j = 1;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(nums[0] , 1);
         while(j < nums.length){
             int num = nums[j];
             if(map.containsKey(num)){
                 map.put(num,map.get(num)+1);
             }
             else{
                 map.put(num,1);
             }
             if(j -i < k){
                 if(map.getOrDefault(num , 1) == 2){
                     return true;
                 }
                 j++;
             }
             else if(j - i == k){
                 int n = nums[i];
                 if(map.getOrDefault(n , 1) == 2){
                     return true;
                 }
                 if(map.getOrDefault( num ,1) == 2){
                     return true;
                 }
                 if(map.getOrDefault(n , 1) > 1){
                     map.put(num , map.get(num)- 1);
                 }
                 else{
                     map.remove(n);
                 }
                 i++;
                 j++;
             }
         }
         return false;
    }
}
