package Math;

public class DivisiblityBy11 {
    public static void main(String[] args) {
        System.out.println(divisible("76945"));
    }
    public static boolean divisible(String s){
        int one = 0;
        int two = 0;
        boolean flag = true;
        for(char ch:s.toCharArray()){
            int num = ch - 48;
            if(flag){
                one += num;
                flag = false;
            }
            else {
                two += num;
                flag = true;
            }
        }
        return Math.abs(one - two) % 11 == 0;
    }
}
