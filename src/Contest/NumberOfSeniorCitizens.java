package Contest;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] as = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(as));
    }
    public static int countSeniors(String[] details) {
        int count = 0;
        for(String s:details){
            int age = ((s.charAt(11) - 48) * 10) + (s.charAt(12) - 48);
            if(age  > 60){
                count++;
            }
        }
        return count;
    }
}
