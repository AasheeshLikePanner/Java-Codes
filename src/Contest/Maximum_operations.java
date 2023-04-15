package Contest;

public class Maximum_operations {
    public static void main(String[] args) {
        System.out.println(minOperations(70));
    }
    public static int minOperations(int n) {
        int count = 0;
        int power = 0;
        int diff1 = 0;
        int diff2 = 0;
        while(n > 0){
            if(checkPerfectSquare(n)){
                return count;
            }
            if(n== 1){
                return count +1;
            }
            if(n%2 == 1){
                n+=1;
                count ++;
            }
            int can = (int)Math.sqrt(n);
            diff1 = Math.abs((int)Math.pow(2, can - 1) - n);
            diff2 = Math.abs((int)Math.pow(2, can ) - n);
            if(diff1 < diff2){
                n = (int)(n  - Math.pow(2, can - 1));
                count++;
            }
            else{
                n = (int)(n  - Math.pow(2, can - 1));
                count++;
            }
        }
        return count;
    }
    static boolean checkPerfectSquare(double number)
    {
        double sqrt=Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}
