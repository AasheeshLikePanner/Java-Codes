package Bitwise;

public class Check {
    public static void main(String[] args) {
        int[] man = {2,3,4,4,3,5,2};
        System.out.println(odd(5));
        System.out.println(dup(man));
        System.out.println((3)&(2));
    }
    private static int dup(int[]  n){
        int ans = 0;
        for (int can:n){
            ans ^= can;
        }
        return ans;
    }

    private static boolean odd(int i) {
        return (i&1) == 1 ;
    }
}
