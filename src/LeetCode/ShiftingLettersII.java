package LeetCode;

public class ShiftingLettersII {
    public static void main(String[] args) {
//        System.out.println((char)('a' + 1));
        System.out.println(shiftingLetters("xuwdbdqik", new int[][]{{4,8,0},{4,4,0},{2,4,}}));
    }
    public static String shiftingLetters(String s, int[][] shifts) {
        int[] dif = new int[s.length() + 1];
        for(int[] shift : shifts){
            if(shift[2] == 0){
                dif[shift[0]] -= 1;
                dif[shift[1] + 1] += 1;
            }
            else{
                dif[shift[0]] += (1);
                dif[shift[1] + 1] -= 1;
            }
        }
        int[] pre = new int[s.length() + 1];
        pre[0] = dif[0];
        for(int i = 1; i < s.length() ; i++){
            pre[i] += dif[i] + pre[i - 1];
        }
        StringBuilder res = new StringBuilder();
        int shift = 0;
        for(int i = 0 ; i < s.length(); i++){
            int n = s.charAt(i)- 'a';
            int x = (pre[i]% 26) + (n );
            if( x >= 26){
                 res.append((char)('a' + (x - 26)));
            }
            else{
                res.append((char)(s.charAt(i) + pre[i]));
            }
        }
        return res.toString();
    }
}
