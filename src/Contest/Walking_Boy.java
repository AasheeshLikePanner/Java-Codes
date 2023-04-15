package Contest;

import java.util.Scanner;

public class Walking_Boy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] time = new int[l];
        for(int i = 0 ; i < l ; i++){
            time[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 1 ; i < l && count <= 2 ; i++ ){
            if(time[i - 1] - time[i] >= 120){
                count++;
            }
        }
        int remain = 0;
        int can = time[l - 1];
        remain = 1400 - can;
        while(remain >= 120 && count <= 2){
            remain -= 120;
            count++;
        }
        if(count >= 2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
