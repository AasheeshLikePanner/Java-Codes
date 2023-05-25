package Contest;

public class WinnerBowlingGam {
    public static void main(String[] args) {
        int[] arr = {5,6,1,10};
        int[] arr2 = {5,1,10,5};
        System.out.println(isWinner(arr,arr2));
    }
    public static int isWinner(int[] player1, int[] player2) {
        int one = 0;
        int two= 0;
        int flag1 = 0;
        int flag2 = 0;
        for(int i =0 ; i < player1.length; i++){
            if(player1[i] == 10 && flag1 !=0 ){
                two += 10;
                flag1 = 2;

            }
            else if(player1[i] == 10 && flag1 == 0){
                flag1 = 2;
                one += 10;
            }
            else if(flag1 > 0 ){
                one += 2*player1[i];
                flag1--;
            }
            else one += player1[i];
            if(player2[i] == 10 && flag2 !=0 ){
                two += 10;
                flag2 = 2;
                continue;
            }
            if(player2[i] == 10 && flag2 == 0) {
                flag2 = 2;
                two += 10;
            }
            else if(flag2 > 0 ){
                two += 2*player2[i];
                flag2--;
            }
            else two += player2[i];
        }
        if(one > two){
            return  1;
        }
        else if(two > one) return 2;
        else return 0;
    }
}

