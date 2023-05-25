package Math;

public class DivisibleOf15 {
    public static void main(String[] args) {
        System.out.println(Divisible("15645746327462384723984023940235"));
    }
    public static boolean Divisible(String s){
        int one = 0;
        if(s.charAt(s.length() - 1) != '5' && s.charAt(s.length() -1 ) != '0'){
            return false;
        }
        for(char ch : s.toCharArray()){
            int num = ch - 48;
            one +=num;
        }
        return one %3 == 0;
    }
}
