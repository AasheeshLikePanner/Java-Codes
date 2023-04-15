package LeetCode_Problems;

public class Reach_The_Number {
    public static void main(String[] args) {
        System.out.println(reachNumber(2));
        System.out.println(reachNumber(3));
        System.out.println(reachNumber(4));
        System.out.println(reachNumber(7));
    }
    public static int reachNumber(int target) {
        int count = 0;
        int can   =0 ;
        int man = 1;
        while (can != target){
            if(can + man > target){
                can -=man;
                if(target == can){
                    return count;
                }
                man +=1;
                count++;
            }
            else{
                can +=man;
                if(target == can){
                    return count;
                }
                count++;
                man +=1;
            }
        }
        return count;
    }
}
