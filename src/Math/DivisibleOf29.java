package Math;

public class DivisibleOf29 {
    public static void main(String[] args) {
        System.out.println(Divisible(348));
    }
    public static boolean Divisible(long s){
        while(s < 100){
            int first = (int)s %10;
            s /= 10;
            s = first * 3 + s;
        }
        return s%29 ==0;
    }
}
