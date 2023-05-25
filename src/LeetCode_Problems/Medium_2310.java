package LeetCode_Problems;

public class Medium_2310 {
    public static void main(String[] args) {

    }
    public int minimumNumbers(int num, int k) {
        if((num % 2 != 0 && k % 2 == 0))  return -1;
        if(num == 0)    return 0;


        return 2;
    }
}
