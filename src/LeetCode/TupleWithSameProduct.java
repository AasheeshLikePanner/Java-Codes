package LeetCode;

import java.util.HashMap;

public class TupleWithSameProduct {
    public static void main(String[] args) {
//        System.out.println(tupleSameProduct(new int[]{2,3,4,6}));
//        System.out.println(tupleSameProduct(new int[]{1,2,4,5,10}));
        System.out.println(tupleSameProduct(new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192}));
    }
    public static int tupleSameProduct(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                long mul = (long) nums[i] *  nums[j];
                map.put( mul, map.getOrDefault(mul, 0) + 1);
            }
        }
        int res = 0;
        for(int n : map.values()){
            if(n > 2){
                res += 4 * n;
            }
            else if(n == 2){
                res += 8;
            }
        }
        return res;
    }
}
