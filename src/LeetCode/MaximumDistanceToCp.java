package LeetCode;

public class MaximumDistanceToCp {
    public static void main(String[] args) {

    }
    public int maxDistToClosest(int[] seats) {
        int one = 0;
        int index = 0;
        int[] prefix = new int[seats.length];
        int[] suffix = new int[seats.length];
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 1){
                one++;
                index = i;
            }
            if(seats[i] == 0){
                if(i > 0){
                    prefix[i] = 1 + prefix[i - 1];
                }
                else{
                    prefix[i] = 1;
                }
            }
            else{
                prefix[i] = 0;
            }
            if(seats[i] == 0){
                if(i < seats.length - 1){
                    suffix[i] = 1 + suffix[i + 1];
                }
                else{
                    suffix[i] = 1;
                }
            }
            else{
                suffix[i] = 0;
            }
        }

        if(one == 1){
            return Math.max(index + 1, seats.length - index + 1);
        }
        int res = Math.max(prefix[seats.length - 1],suffix[0] );
        for(int i=1;i<seats.length;i++){
            res=Math.max(res,Math.min(prefix[i],suffix[i]));
        }
        return res;
    }
}
