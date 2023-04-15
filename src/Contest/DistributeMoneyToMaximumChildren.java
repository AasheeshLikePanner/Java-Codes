package Contest;

public class DistributeMoneyToMaximumChildren {
    public static int distMoney(int money, int children) {
        int child = 0;
        if(money < children){
            return  -1;
        }
        money -= children;
        for (int i = 1; i < children; i++) {
            if(money >= 7){
                child++;
                money-=7;
            }
            else{
                return child;
            }
        }
        if(money == 3){
            if(child > 0){
                child--;
            }
            else{
                return  -1;
            }
        }
        else if (money == 7){
            child++;
        }
        return child;
    }
    public static void main(String[] args) {
        System.out.println(distMoney(20 , 3));
    }
}
