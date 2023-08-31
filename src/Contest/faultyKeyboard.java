package Contest;

public class faultyKeyboard {
    public static void main(String[] args) {
        System.out.println(finalString("string"));
    }
    public static String finalString(String s) {
        StringBuilder res = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == 'i'){
                res.reverse();
            }
            res.append(ch);
        }
        return res.toString();
    }
}
