package Contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        easy = sc.nextInt();
        medium = sc.nextInt();
        hard = sc.nextInt();
        time = sc.nextInt();

    }
    static List<List<Integer>> outer = new ArrayList<>();
    static int easy , medium , hard, time;
    static int max = 0;
    static int t1 = 0 , t2 = 0 , t3 = 0;
    public static void pl2(){
        int temp = time;
        while(temp >= 2 ) {
            if(medium > 0){
                List<Integer> inner = new ArrayList<>();
                inner.add(2);
                inner.add(t1);
                inner.add(t1 + 3);
                t1 = t1 + 3;
                temp -= 3;
                outer.add(inner);
            }
            if(hard > 0){
                List<Integer> inner = new ArrayList<>();
                inner.add(2);
                inner.add(t1);
                inner.add(t1 + 4);
                t1 = t1 + 4;
                temp -= 4;
                outer.add(inner);
            }
            if (easy > 0) {
                List<Integer> inner = new ArrayList<>();
                inner.add(2);
                inner.add(t1);
                inner.add(t1 + 2);
                t1 = t1 + 2;
                temp -=2;
                outer.add(inner);
            }

        }
    }
    public static void pl1(){
        int temp = time;
        while(temp >= 2 ) {
            if (easy > 0) {
                List<Integer> inner = new ArrayList<>();
                inner.add(1);
                inner.add(t1);
                inner.add(t1 + 2);
                t1 = t1 + 2;
                temp -=2;
                outer.add(inner);
            }
            if(medium > 0){
                List<Integer> inner = new ArrayList<>();
                inner.add(1);
                inner.add(t1);
                inner.add(t1 + 3);
                t1 = t1 + 3;
                temp -= 3;
                outer.add(inner);
            }
            if(hard > 0){
                List<Integer> inner = new ArrayList<>();
                inner.add(1);
                inner.add(t1);
                inner.add(t1 + 4);
                t1 = t1 + 4;
                temp -= 4;
                outer.add(inner);
            }
        }
    }
}
