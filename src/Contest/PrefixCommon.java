package Contest;

import java.util.Arrays;
import java.util.HashMap;

public class PrefixCommon {
    public static void main(String[] args) {
        int[] a  = {2,3,1} , b = {3,1,2};
        System.out.println(Arrays.toString(can(a,b)));
    }

    public static int[] can(int[] A, int[] B) {
        int[] result= new int[A.length];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0 ; i < A.length ; i++){
            int count = 0;
            map.put(A[i] , 1);
            for(int j = 0; j <= i ; j++){
                if(map.containsKey(B[j])){
                    count++;
                }
            }
            result[i] = count;

        }
        return result;
    }

}
