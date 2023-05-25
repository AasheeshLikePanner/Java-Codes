package Math;

public class DivisiblityOf6 {
    public static void main(String[] args) {
        System.out.println(isDivisible("1124"));
    }
    // First Method 1000%4 == 4;
//    public static boolean isDivisible(String s){
//        long sum = 0;
//        for(int num:s.toCharArray()){
//            sum += num* 4L;
//        }
//        return sum % 6 == 0;
//    }
    // Second Method 6 divisible by number if 2 and 3 is also divisible by number;
    public static boolean isDivisible(String s) {
        long sum = 0;
        long index = s.length();
        for(int num:s.toCharArray()){
            sum += num;
        }
        return sum%3 == 0 && s.charAt(s.length() - 1) %2 == 0;
    }
}
