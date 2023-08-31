package Contest;

import java.util.HashSet;

public class FindtheMinPossible {
    public static void main(String[] args) {
        System.out.println(minimumPossibleSum(3,100));
    }
    public static long minimumPossibleSum(int n, int target) {
        long sum = 0;
        int count  = 1;
        HashSet<Long> set = new HashSet<>();
        long i  =1;
        while(count <= n){
            if(!set.contains(target - i)){
                sum += i;
                count++;
                set.add(i);
            }
            i++;
        }
        return sum;
    }
}
