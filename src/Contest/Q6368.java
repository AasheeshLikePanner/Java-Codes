package Contest;

import java.sql.Array;
import java.util.Arrays;

public class Q6368 {
    public static void main(String[] args) {
        int[] can1 = divisibilityArray("998244353", 3);
//        int[] can2 = divisibilityArray("1010",10);
        System.out.println(Arrays.toString(can1));
    }
    public static int[] divisibilityArray(String word, int m) {
        long can = 0;
        int[] div = new int[word.length()];
        long num = 0;
        int index= 0;
        for(int i = 1 ; i<= div.length; i ++){
            num = Long.parseLong(word.substring(0,i));
            can = num%m;
            if(can == 0 ){
                if( index < div.length){
                    div[index] = 1;
                    index++;
                }
            }
            else{
                if( index < div.length - 1){
                    div[i] = 0;
                    index++;
                }
            }
        }
        return div;
    }
}
