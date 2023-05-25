package Math.GCD_LCM;

public class GCDOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,10};
        System.out.println(arrgcd(arr ));
    }
    public static int arrgcd(int[] arr){
        int prev = arr[arr.length- 1];
        for(int i = arr.length - 2;i >= 0 ;i--){
            int one = arr[i];
            prev = gcd(one, prev);
        }
        return prev;
    }
    public static int gcd(int one , int two){
        return (two == 0)?  one: gcd(two , one % two);
    }
}
