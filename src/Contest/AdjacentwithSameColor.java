package Contest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AdjacentwithSameColor {
    public static void main(String[] args) {
        int[][] res  = {{0,2},{1,2},{3,1},{1,1},{2,1}};
        System.out.println(Arrays.toString(colorTheArray(4,res)));
    }
    public static int[] colorTheArray(int n, int[][] queries) {
        int[] res = new int[queries.length];
        int[] test = new int[n];
        int count = 0;
        for(int i = 0; i < queries.length ; i ++){
            int index = queries[i][0];
        if(( test[index] != 0&& count != 0) && ((index < n - 1 && test[index  + 1] == test[index]) ||( index > 0 && test[index - 1] == test[index]) )){
                count--;
            }
            test[queries[i][0]] = queries[i][1];

            if(index > 0 && test[index - 1] == test[index]){
                int ans = res[index - 1];
                if(ans == 0){
                    count +=1;
                }
                else{
                    count += ans + 1;
                }
            }
            if(index < n - 1 && test[index  + 1] == test[index]){
                int ans = res[index + 1];
                if(ans == 0){
                    count +=1;
                }
                else{
                    count += ans + 1;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
