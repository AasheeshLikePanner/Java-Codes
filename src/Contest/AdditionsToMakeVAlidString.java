package Contest;

import java.util.HashMap;

public class AdditionsToMakeVAlidString {
    public static void main(String[] args) {
        String word1 = "aaa";
        String word2 = "abaa";

        String word3 = "aaaabb";
        System.out.println(addMinimum(word2));
    }
    public static int addMinimum(String word) {
        int add = 0;
        char[] arr = word.toCharArray();
        for(int i =0 ;  i < arr.length; i++){
            char ch = arr[i];
            if(i < arr.length - 1 && (ch == 'a' && arr[i + 1] != 'b')){
                add++;
            }
            else if(i < arr.length  -1 && (ch == 'b' && arr[i + 1] != 'c')){
                add++;
            }
            else if((i < arr.length  -1 && (ch == 'a' && arr[i + 1] == 'a')) || (i < arr.length  -1 && (ch == 'c' && arr[i + 1] == 'c')) || (i < arr.length  -1 && (ch == 'b' && arr[i + 1] == 'b'))){
                add +=2;
            }
            else if( i < arr.length  - 2 && ((ch == 'b' && arr[i + 1] != 'c') && (ch == 'b'))){

            }
        }

        return add;
    }
}
