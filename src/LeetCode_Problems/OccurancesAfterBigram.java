package LeetCode_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class OccurancesAfterBigram {

    public static void main(String[] args) {
        String text = "jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa";
        String first = first =
                "kcyxdfnoa", second =
                "jkypmsxd";
        System.out.println(Arrays.toString(findOcurrences(text , first , second)));
    }
    public static String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        ArrayList<String> list=  new ArrayList<>();
        boolean one = false;
        boolean two = false;
        for(String can:arr ){
            if(one && two){
                list.add(can);
                one= false;
                two = false;
            }
            if(can.equals(first)){
                one =true;
            }
            else if(can.equals(second)){
                two  = true;
            }
            if ((one && !two) || (!one && two) ){
                one = false;
                two = false;
            }
        }
        return list.toArray(new String[0]);
    }
}
