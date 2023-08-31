package LeetCode;

public class FindPunishmentNumber {
    public static void main(String[] args) {

    }
    public int punishmentNumber(int n) {
        int res = 0;
        for(int i = 1; i<= n ; i++){
            if(helper(i * i, i)){
                res += i * i;
            }
        }
        return res;
    }

    private boolean helper(int sqr, int i) {
        int sum = 0;
        while(sqr != 0) {
            sum += sqr % 10;
            sqr /= 10;
        }
        return sum == i;
    }
}
