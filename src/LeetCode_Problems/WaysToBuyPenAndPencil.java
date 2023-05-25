package LeetCode_Problems;

public class WaysToBuyPenAndPencil {
    public static void main(String[] args) {
        int total = 5, cost1 = 10, cost2 = 10;
        System.out.println(waysToBuyPensPencils(total , cost1 , cost2));
    }

    public static long waysToBuyPensPencils(int total, int pen, int pencil) {
        int l = total / pen;
        long sum = 0;
        for(int i = 0 ; i <= l ; i++){
            int num = total - (i * pen);
            sum += num/pencil + 1;
        }
        return sum;
    }

}
