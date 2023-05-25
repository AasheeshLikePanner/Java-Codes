package Math;

public class DivisiblityOf3 {
    public static void main(String[] args) {
        System.out.println(isDivisible("123456758933312"));
    }
    public static boolean isDivisible(String s){
        int sum = 0;
        for(int num: s.toCharArray()){
            sum += num;
        }
        return sum %3 == 0;
    }
}
