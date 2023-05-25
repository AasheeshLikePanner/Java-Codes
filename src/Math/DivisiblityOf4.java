package Math;

public class DivisiblityOf4 {
    public static void main(String[] args) {
        System.out.println(isDivisible("123456758933l"));
    }
    public static boolean isDivisible(String s){
        int sum = s.charAt(s.length() - 2)*10 + s.charAt(s.length() - 1);
        return sum % 4 == 0;
    }
}
