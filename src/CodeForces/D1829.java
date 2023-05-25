package CodeForces;

import java.util.Scanner;

public class D1829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int one = sc.nextInt();
            int two = sc.nextInt();
            if(one < two || one % 3 != 0){
                System.out.println("NO");
                        continue;
            }
            if(solve(one, two)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    private static boolean solve(int one, int two) {
        if(one == two) {
            return true;
        }
        if(one % 3 != 0){
            return false;
        }
        return solve(one/ 3 , two) || solve(2 * one / 3 , two);
    }

}
