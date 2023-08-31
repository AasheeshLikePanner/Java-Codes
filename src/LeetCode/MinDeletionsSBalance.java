package LeetCode;

public class MinDeletionsSBalance {
    public static void main(String[] args) {
//        System.out.println(minimumDeletions("aababbab"));
        System.out.println(minimumDeletions("bbaaaaabb"));
    }
    public static int minimumDeletions(String s) {
        int count = 0;
        int a = 0;
        int b = 0;
        boolean flag = false;
        int[] a1 = new int[s.length()];
        int[] b1 = new int[s.length()];
        StringBuilder sam = new StringBuilder();
        for(char ch:s.toCharArray()){

            if(!flag && ch == 'b'){
                flag = true;
            }
            if(flag){
                sam.append(ch);
            }
            if(flag){
                if(ch == 'a'){
                    a++;
                }
                else{
                    b++;
                }
            }
        }
        int cal1 = 0;
        int cal2 = 0;
        for(int i = s.length() - 1; i>=0 ; i--){
            char ch = s.charAt(i);
            if(ch == 'a'){
                cal1++;
            }
            else {
                cal2++;
            }
            a1[i] = Math.abs( cal1);
            b1[i] = Math.abs( cal2);
        }
        for(int i = 0; i < sam.length();i++){

        }
        return count;
    }
}
