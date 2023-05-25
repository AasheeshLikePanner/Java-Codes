package Math;

public class DivisibleBy7 {
    public static void main(String[] args) {
        System.out.println(divisible(616));
    }
    public static boolean divisible(int num){
        if(num == 0 || num == 7){
            return true;
        }
        if(num < 10){
            return false;
        }
        return divisible(Math.abs(num / 10 - 2 * (num - num/10 *10)));
    }
}
