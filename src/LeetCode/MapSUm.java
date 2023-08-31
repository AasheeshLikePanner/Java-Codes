package LeetCode;

import java.util.HashMap;

public class MapSUm {

}
class MapSum {

    HashMap<String, Integer> map;
    public MapSum() {
        map =new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for(String s : map.keySet()){
            if(s.startsWith(prefix)){
                s += map.get(s);
            }
        }
        return sum;
    }
}
