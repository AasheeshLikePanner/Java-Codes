package LeetCode_Problems;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }
    public static String countAndSay(int n) {
        return helper("1", 1,n);
    }
    public static String helper(String can ,int num, int n ){
        if(num == n ){
            return can;
        }
        int count = 0;
        char copy;
        StringBuilder result = new StringBuilder();
        char[] arr = can.toCharArray();
        int i = 0;
        int j =0;
        while( j < arr.length){
            if( arr[i ] == arr[j]){
                count++;
                j++;
            }
            else{
                result.append(count );
                result.append(arr[i]);
                i= j;
                count = 0;
            }
        }
        result.append(count);
        result.append(arr[arr.length - 1]);
        return helper( result.toString() , num + 1, n);
    }
}
