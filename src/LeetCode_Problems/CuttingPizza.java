package LeetCode_Problems;

public class CuttingPizza {
    public static void main(String[] args) {
        String[] pizza =    {"A..","AAA","..."};
        String[] pizza1 = {"A..","AA.","..."};
        System.out.println(ways(pizza,3));
    }
    public static int ways(String[] pizza, int k) {
        solve(pizza , 0 , 0 , k , 0);
        return count;
    }
    static int count = 0;

    public static void solve(String[] pizza , int row , int col , int k , int cut){
        if(cut ==  k - 1){
            if(check(pizza ,row , col)){
                count+=1;
                return ;
            }
            return;
        }
        if(hori(pizza , row,  col)){           // Horizontaly
            solve(pizza , row + 1 , col , k, cut + 1);
        }
        if(verti(pizza , row, col)){           // Vertically
            solve(pizza , row  , col + 1, k, cut + 1);
        }
    }
    public static boolean check(String[] pizza , int row , int col ){
        for(int i = row;  i< pizza.length ; i++){
            for (int j = col; j < pizza[0].length(); j++) {
                if(pizza[i].charAt(j) == 'A'){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean verti(String[] pizza , int row , int col){
        for(int i = row ; i< pizza.length ; i++){
            char ch = pizza[i].charAt(col);
            if(ch == 'A'){
                return true;
            }
        }
        return false;
    }
    public static boolean hori(String[] pizza , int row , int col){
        String can = pizza[row];
        char[] man = can.toCharArray();
        for(int i = col ; i < man.length ; i++){
            char ch = man[i];
            if(ch == 'A'){
                return true;
            }
        }
        return false;
    }
}
