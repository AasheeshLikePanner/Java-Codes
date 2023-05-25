package Math;

public class DivisibleOf12 {
    public static void main(String[] args) {
        System.out.println(Divisible("12244824607284961224"));
    }
    public static boolean Divisible(String s){
        int two = (s.charAt(s.length() - 2) - 48) + (s.charAt(s.length() - 1) - 48);
        int one = 0;
        for(char ch: s.toCharArray()){
            int num = ch - 48;
            one += num;
        }
        return two%4 == 0 && one%3 == 0;
    }
}
