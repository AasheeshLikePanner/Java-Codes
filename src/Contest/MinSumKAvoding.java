package Contest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinSumKAvoding {
    public static void main(String[] args) {
        System.out.println(minimumSum(5,4));
        System.out.println(minimumSum(3,6));
        System.out.println(minimumSum(5,13));
    }
    public static int minimumSum(int n, int k) {
        int sum = 0;
        int i = 1;
        int prev = 0;
        HashSet<Integer> set = new HashSet<>();
        while(n-- > 0){
            if(set.contains( k - i)){
                i++;
                sum += i++;
            }
            else{
                sum += i;
                set.add(i++);
            }
        }
        return sum;
    }
}
