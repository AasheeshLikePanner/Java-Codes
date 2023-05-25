package CodeForces;

import java.util.Scanner;

public class C1833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t= sc.nextInt();
        while(t-- > 0){
            int l = sc.nextInt();
            long[] arr = new long[l];
            for(int i = 0; i < l ; i++){
                arr[i] = sc.nextInt();
            }
            if(solve(arr, l)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    private static boolean solve(long[] arr, long l) {  // 1 4 7 6 9
        long even = 0;
        long odd = 0;
        long min = (arr[0]%2 !=0 )? arr[0] : Long.MAX_VALUE;
        if(arr[0] %2 == 0){
            even++;
        }
        else{
            odd++;
        }
        for(int i = 1 ; i< l ; i++){
            long num = arr[i];
            if(num % 2 == 0){
                even++;
            }
            if(num - min > 0 && (num - min) % 2 != 0){
                 odd++;
            }
            if(num%2 != 0){
                odd++;
            }
            if(num - min > 0){
                if((num - min)%2 == 0){
                    even++;
                }
            }
            if(num % 2 != 0){
                min = Math.min(min, num);
            }
        }
        if(arr[0] % 2 != 0 && (arr[0] - min > 0 && (arr[0] - min) % 2 == 0)){
            even++;
        }
        if(arr[0] %2 == 0 && (arr[0] - min > 0 && (arr[0] - min )% 2 != 0)){
            odd++;
        }
        return even == l || odd == l;
    }
}
