package LeetCode_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1};
        int[] arr1 = {1,2};
        System.out.println(numRescueBoats(arr,3));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int count =0 ;
        int start = 0;
        Arrays.sort(people);
        int end = people.length - 1;
        HashMap<Integer , Integer> hash = new HashMap<>();
        while(start < people.length){
            if(hash.containsKey(start)){
                start++;
                end = people.length -1 ;
            }
            else if(start >= end){
                if(hash.containsKey(start)){
                    start++;
                    end = people.length - 1;
                }
                else{
                    hash.put(start , 1);
                    start++;
                    count++;
                }
            }
            else if(people[start] + people[end] > limit){
                end--;
            }
            else if((people[start] + people[end] <= limit) && !hash.containsKey(end)){
                hash.put(end , 1);
                start++;
                end = people.length - 1;
                count++;
            }
            else{
                end--;
            }
        }
        return count;
    }
}
