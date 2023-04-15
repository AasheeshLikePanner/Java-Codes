package LeetCode_Problems;

public class LongestBalancedSubstring {
    public static void main(String[] args) {
        String s =  "01000111";
        System.out.println(can(s));
    }
    public static int can(String s) {
        int max = 0;
        int zero = 0;
        int one = 0;
        char[] arr = s.toCharArray();
        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] == '1'){
                continue;
            }
            one = 0;
            zero = 0;
            for (int j = i; j <= arr.length; j++) {
                if(j == arr.length){
                    if(one == zero  ){
                        int num = one *2;
                        max = Math.max(num , max);
                        break;
                    }
                    else if(one < zero){
                        int num = one*2;
                        max = Math.max(num , max);
                        break;
                    }
                    else if(one > zero){
                        int num = zero*2;
                        max = Math.max(num , max);
                        break;
                    }
                }
                if(  (j != i && j > 0) && (arr[j -1] == '1' && arr[j] == '0')){
                   if(one == zero  ){
                       int num = one *2;
                       max = Math.max(num , max);
                       break;
                   }
                   else if(one < zero){
                       int num = one*2;
                       max = Math.max(num , max);
                       break;
                   }
                   else if(one > zero){
                       int num = zero*2;
                       max = Math.max(num , max);
                       break;
                   }
                }
                if(arr[j] == '1'){
                    one+=1;
                }
                else {
                    zero +=1;
                }
            }
        }
        return max;
    }
}
