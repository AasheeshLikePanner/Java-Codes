package CodeForces;

import java.util.Scanner;

public class RudophnAndTicTacToe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            char[][] arr = new char[3][3];
            for(int i = 0; i < 3; i++){
                String s = sc.next();
                for(int j = 0; j < 3; j++){
                    arr[i][j] = s.charAt(j);
                }
            }
            String res  = solve(arr);
            System.out.println(res);
        }
    }

    private static String solve(char[][] arr) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
               char ch = arr[i][j];
               if(ch == '.')    continue;
               if(!find(arr, ch, i , j).equals("DRAW")){
                   return String.valueOf(ch);
               }
            }
        }
        return "DRAW";
    }

    private static String find(char[][] arr, char ch, int i, int j) {
        if(i == 0 && (arr[i + 1][j] == ch && arr[i + 2][j] == ch))     return String.valueOf(ch);
        if((i == 0 && j == 0) && (arr[i + 1][j + 1] == ch && arr[i + 2][j + 2] == ch))     return String.valueOf(ch);
        if((i == 2 && j == 2) && (arr[i - 1][j - 1] == ch && arr[i - 2][j - 2] == ch))     return String.valueOf(ch);
        if(j == 0 && (arr[i][j + 1] == ch && arr[i][j + 2] == ch))     return String.valueOf(ch);
        return "DRAW";
    }
}
