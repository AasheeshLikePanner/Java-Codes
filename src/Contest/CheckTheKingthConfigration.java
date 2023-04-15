package Contest;

public class CheckTheKingthConfigration {
    public static void main(String[] args) {
        int[][] can = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        System.out.println(checkValidGrid(can));
    }
    public static boolean checkValidGrid(int[][] grid) {
        for(int i=  0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++) {
                if(!isSafe(grid , i , j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSafe(int[][] can, int row, int col){
        int one = 0 ;
        int two = 0;
        int num = can[row][col];
        while(num > 0){
            if(one == can[0].length - 1) { two++; one= 0; num--;}
            else one ++; num--;
        }
        if(row == two && col == one){
            return true;
        }
        if(row + 2 == two && col - 1== one){
            return true;
        }
        if(row + 2 == two && col + 1 == one){
            return true;
        }
        if(row - 2 == two && col - 1 == one){
            return true;
        }
        if(row - 2 == two && col + 1 == one){
            return true;
        }
        if(row + 1 == two && col + 2 == one){
            return true;
        }
        if(row + 1 == two && col - 2 == one){
            return true;
        }
        if(row - 1 == two && col + 2 == one){
            return true;
        }
        if(row - 1 == two && col + 2 == one){
            return true;
        }
        return false;
    }
}
