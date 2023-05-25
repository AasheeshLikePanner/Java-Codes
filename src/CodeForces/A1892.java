package CodeForces;

import java.util.Scanner;

public class A1892 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char[] ch = {'c','o','d','e','f','o','r','c','e','s'};
        while(t > 0){
            String s = sc.next();
            char[] arr = s.toCharArray();
            int count = 0;
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] != ch[i]){
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
