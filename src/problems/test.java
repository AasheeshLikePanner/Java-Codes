package problems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] can = {557663,280817,472963,156253,273349,884803,756869,763183,557663,964357,821411,887849,891133,453379,464279,574373,852749,15031,156253,360169,526159,410203,6101,954851,860599,802573,971693,279173,134243,187367,896953,665011,277747,439441,225683,555143,496303,290317,652033,713311,230107,770047,308323,319607,772907,627217,119311,922463,119311,641131,922463,404773,728417,948281,612373,857707,990589,12739,9127,857963,53113,956003,363397,768613,47981,466027,981569,41597,87149,55021,600883,111953,119083,471871,125641,922463,562577,269069,806999,981073,857707,831587,149351,996461,432457,10903,921091,119083,72671,843289,567323,317003,802129,612373};
        int[] man = {4,7,15,8,3,5};
        System.out.println(findValidSplit(can));
    }
    public static int findValidSplit(int[] nums) {
        long x = 0;
        long y =0;
        long rmul = rsum(nums);
        long gcd = -1;
        for(int j =0 ; j< nums.length - 1 ; j ++){
            x =  lmul(nums,j);
            y = lsum(nums,j,  rmul);
            for(int i = 1; i <= x && i <= y; i++)
            {
                if(x%i==0 && y%i==0)
                    gcd = i;
            }
            if(gcd == 1){
               return j;
            }
        }

        return -1;
    }
    private static long lsum(int[] can, int index , long man) {
        long sum = man ;
        for(int i = index ; i >= 0 ; i--){
            sum /= can[i];
        }
        return sum;
    }
    private static long lmul(int[] can, int index) {
        long sum = 1;
        for(int i = index; i >= 0 ; i--){
            sum *= can[i];
        }
        return sum;
    }

    private static long rsum(int[] can ) {     // [10,4,8,3]      left -> 0,10,14,22   right -> 15,11,3,0
        long sum = 1 ;
        for (int j : can) {
            sum *= j;
        }
        return sum;
    }
}
