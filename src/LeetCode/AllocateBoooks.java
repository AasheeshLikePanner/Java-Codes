package LeetCode;

public class AllocateBoooks {
    public static void main(String[] args) {
        System.out.println(books(new int[]{12,34,67,90},2));
    }
    public static int books(int[] A, int B) {
        int s = Integer.MAX_VALUE;
        int e = 0;
        int res = Integer.MAX_VALUE;
        for(int n: A){
            e += n;
            s = Math.min(s, n);
        }
        while(s <= e){
            int mid  = s + (e - s)/2;
            boolean val = binarysearch(A , B , mid);
            if(val){
                res = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return res;
    }

    private static boolean binarysearch(int[] a, int b, int mid) {
        int sum  = 0;
        for(int i : a) {
            sum += i;
            if (sum > mid) {
                sum = i;
                b--;
            }
        }
        return b == 1;
    }
}
