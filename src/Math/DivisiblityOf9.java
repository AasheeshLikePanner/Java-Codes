package Math;

public class DivisiblityOf9 {
    public static void main(String[] args) {
        System.out.println(isDivisible("234567876799333"));
    }
    public static boolean isDivisible(String s) {
        long sum = 0;
        for(char ch:s.toCharArray()){
            int num = (int)ch - 48;
            sum += num;
        }
        return sum % 9  == 0;
    }
}
