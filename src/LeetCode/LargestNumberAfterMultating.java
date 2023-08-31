package LeetCode;

public class LargestNumberAfterMultating {
    public static void main(String[] args) {
        System.out.println(maximumNumber("132" , new int[]{9,8,5,0,3,6,4,2,6,8}));
    }
    public static String maximumNumber(String num, int[] change) {
        StringBuilder s =new StringBuilder();
        for(int i = 0;i < num.length(); i++){
            int one = Integer.parseInt(String.valueOf(num.charAt(i)));
            int two = change[one];
            if(two > one){
                s.append(two);
            }
            else{
                s.append(one);
            }
        }
        return s.toString();
    }
}
