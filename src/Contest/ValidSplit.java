package Contest;
import java.util.*;
import java.util.stream.Collectors;

public class ValidSplit {
    public static void main(String[] args) {
        int[] ints = {2,1,3,1,1,1,7,1,2,1};
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println(minimumIndex(list));
    }
    public static int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int val = 0;
        for(int n: nums){
            map.put(n, map.getOrDefault(n , 0 ) + 1);
            max = Math.max(max, map.get(n));
            if(max == map.get(n)){
                val = n;
            }
        }
        int index = 0;
        int count = 0;
        for(int i = 0; i< nums.size() - 1; i++){
            if(nums.get(i) == val){
                count += 1;
                if(count * 2 > i + 1 && (max - count) * 2 > nums.size() - i - 1){
                    return i;
                }
            }
        }
        return  -1;
    }
}
