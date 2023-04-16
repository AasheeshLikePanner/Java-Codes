import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class animal{
    animal(){
        System.out.println("Animal is born");
    }
    public void eat(){
        System.out.println("Eattingggggg");
    }
}
class dog extends animal{
    dog(){
        super();
    }
    void run(){
        System.out.println("Running");
    }

}

class Main{

    public static void main(String[] args) {

    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int count =0;
        int row = 0;
        int col = 0;
        for(int i =0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(max < count){
                row = i;
                col = count;
            }
            max =Math.max(count , max);
            count = 0;
        }
        int[] result  = {row , col};
        return result;
    }

}