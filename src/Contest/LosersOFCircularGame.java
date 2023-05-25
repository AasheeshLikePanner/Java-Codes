package Contest;

import java.util.ArrayList;
import java.util.*;

public class LosersOFCircularGame {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(circular(5,2)));
    }
    public static int[] circular(int n, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int s = 1;
        int i = 1;
        while(true){
            if(map.containsKey(s)){

                break;
            }
            else{
                map.put(s , 1);
            }
            s +=  (i*k);
            i++;
            while(s > n){
                s -= n;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j =1 ; j <= n; j++){
            if(!map.containsKey(j)){
                list.add(j);
            }
        }
        return list.stream().mapToInt(m->m).toArray();
    }

}
