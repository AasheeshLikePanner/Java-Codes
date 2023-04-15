package LeetCode_Problems;

public class K_th_Symbol_in_Grammar {
    public static void main(String[] args) {
        int can = kthGrammar(2,2);
        System.out.println(can);
    }
    public static int kthGrammar(int n, int k) {
        String original = "0";
        String temp = "";
        for(int i = 0; i< n - 1; i++){
            for(int j = 0;  j < original.length(); j++){
                char ch = original.charAt(j);
                if(ch == '0'){
                    temp = temp + "01";
                }
                else {
                    temp = temp + "10";
                }
            }
            original = temp;
            temp = "";
        }
        char ch = original.charAt(k - 1);
        if((int)ch == 49){
            return 1;
        }
        else{
            return 0;
        }
    }
}
