package CodeForces;

import java.util.Scanner;

public class SumInBinaryTree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long val = sc.nextLong();
            long ans = val;
            while(val != 0){
                ans += val/2;
                val /=2;
            }
            System.out.println(ans);
        }
    }
}
