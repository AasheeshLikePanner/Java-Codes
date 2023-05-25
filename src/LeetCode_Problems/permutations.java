package LeetCode_Problems;
    import java.util.*;
public class permutations {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        genrate(nums, new ArrayList<>(), outer,  new HashSet<Integer>());
        return outer;
    }

    private void genrate(int[] nums, ArrayList<Integer> inner, List<List<Integer>> outer, Set<Integer> set) {
        if(inner.size() == nums.length){
            outer.add(new ArrayList<>(inner));
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            inner.add(nums[i]);
            genrate(nums,inner,outer,set);
            inner.remove(inner.get(set.size() - 1));
            set.remove(set.size() - 1);
        }
    }
}
