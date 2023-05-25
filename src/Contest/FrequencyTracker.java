package Contest;

import java.util.HashMap;

public class FrequencyTracker {
    public static void main(String[] args) {

    }
    HashMap<Integer, Integer> map;
    public FrequencyTracker() {
        map = new HashMap<>();
    }

    public void add(int number) {
        if(map.containsKey(number)){
            map.put(number,map.get(number) + 1);
        }
        else{
            map.put(number, 1);
        }
    }

    public void deleteOne(int number) {
        if(map.containsKey(number)){
            map.put(number, map.get(number) - 1);
            if(map.get(number) == 0){
                map.remove(number);
            }
        }
    }

    public boolean hasFrequency(int frequency) {
        return map.containsValue(frequency);
//        for(int can:map.values()){
//            if(can == frequency){
//                return true;
//            }
//        }
    }
}
