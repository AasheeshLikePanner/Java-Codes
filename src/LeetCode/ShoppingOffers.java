package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ShoppingOffers {
    public static void main(String[] args) {
        List<Integer> price = new ArrayList<>();
        price.add(2);   price.add(5);
        List<List<Integer>> sp = new ArrayList<>();

    }

    public static int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        special.add(price);
        return helper(price, special, needs, special.size() - 1, 0);
    }

    private static int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int i, int sum) {
        if(i < 0){
            for (Integer need : needs) {
                if (need != 0) {
                    return (int) 1e9;
                }
            }
            return 0;
        }
        int one = helper(price, special, needs, i - 1, sum);
        int two = (int) 1e9;
        boolean flag = true;
        for(int j = 0; j < price.size() ; j++){
            if(needs.get(j) < special.get(i).get(j)){
                flag = false;
                break;
            }
        }
        if(flag){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < price.size() ; j++){
                list.add(needs.get(j) - special.get(i).get(j));
            }

            two = helper(price, special, list, i, sum +  + special.get(i).get(price.size() - 1));
        }
        return Math.min(two, one);
    }

}
