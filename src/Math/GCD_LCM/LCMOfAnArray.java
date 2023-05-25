package Math.GCD_LCM;

public class LCMOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3};
        System.out.println(lcm(arr, 0));
    }
    public static int lcm(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        int a = arr[index];
        int b = lcm(arr, index + 1);
        return (a*b)/gcd(a , b);
    }
    public static int gcd(int one , int two){
        return (two == 0)?  one: gcd(two , one % two);
    }
}
