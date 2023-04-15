package Hash_Map;

import java.util.*;

public class practise {
    public static void main(String[] args) {
//        String can = "asheesh";
//        System.out.println(max(can));
        int[] arr1=  {1,1,2,3,4,5,3,3,3};
        int[] arr2 = {1,1,3,4,2};
        System.out.println(common2(arr1,arr2));
    }

    private static List<Integer> common2(int[] arr1 , int[] arr2){
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int can: arr1){
            if(hash.containsKey(can)){
                int pre = hash.get(can);
                int next= pre+1;
                hash.put(can , next);
            }
            else{
                hash.put(can , 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int can: arr2){
            if(hash.containsKey(can)){
                int n = hash.get(can);
                while(n > 0){
                    list.add(can);
                    n--;
                }
                hash.remove(can);
            }
        }
        return list;
    }

    private static List<Integer> common(int[] arr1 , int[] arr2){
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int can: arr1){
            if(hash.containsKey(can)){
                int pre = hash.get(can);
                int next= pre+1;
                hash.put(can , next);
            }
            else{
               hash.put(can , 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int can: arr2){
            if(hash.containsKey(can)){
                list.add(can);
                hash.remove(can);
            }
        }
        return list;
    }

    private static int max(String can) {
        int max = 0;
        HashMap<Character , Integer> hash= new HashMap<>();
        char[] arr = can.toCharArray();
        for (char ch:arr) {
            if(hash.containsKey(ch)){
                int val  = hash.get(ch);
                int increase = val+1;
                hash.put(ch, increase);
            }
            else{
                hash.put(ch, 1);
            }
        }
        max= hash.get(arr[0]);
        for (char ch:arr) {
            if(hash.get(ch) > max){
                max = hash.get(ch);
            }
        }
        return max;
    }
}
