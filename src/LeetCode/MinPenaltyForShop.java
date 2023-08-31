package LeetCode;

public class MinPenaltyForShop {
    public static void main(String[] args) {
        System.out.println(bestClosingTime("YYNYY"));
    }
    public static int bestClosingTime(String customers) {
        int y = 0;
        int n = 0;
        for(char ch: customers.toCharArray()){
            if(ch =='Y') y++;
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        int i = 0;
        for(char ch: customers.toCharArray()){
            if(ch == 'N'){
                if(min > y + n){
                    min  = y + n;
                    index = i;
                }
                n++;
            }
            else if(ch == 'Y'){
                if(min > y + n){
                    min  = y + n;
                    index = i;
                }
                y--;
            }
            else{
                if(min > y + n){
                    min  = y + n;
                    index = i;
                }
            }
            i++;

        }
        return index;
    }
}
