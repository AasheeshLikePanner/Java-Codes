package LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class SellDiminishingColoredBalls {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{3,5},6));
    }
    public static int maxProfit(int[] inventory, int orders) {
        Arrays.sort(inventory);
        int res = 0;
        int mod = (int) 1e9 + 7;
        int save = 1;
        for(int i = inventory.length - 1; i >= 0  && orders > 0 ; i--){
            if(i > 0 && (save * (inventory[i] - inventory[i - 1] )) < orders){
                int dif = inventory[i] - inventory[i - 1];
                res += (save * (inventory[i -1 ] + inventory[i] + 1) * (dif))/2;
                orders -= save * dif;
                res = res% mod;
            }
            else{
                int div = orders/save;
                int rem = orders%save;
                res += (save*(inventory[i] + (inventory[i] - rem + 1)) * rem)/2;
                res += div * (inventory[i] - rem);
                return res % mod;
            }
            save++;
        }
        return res;
    }
}
