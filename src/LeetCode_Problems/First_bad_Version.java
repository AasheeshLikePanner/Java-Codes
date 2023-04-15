package LeetCode_Problems;

public class First_bad_Version {
    public static void main(String[] args) {
        int first = firstBadVersion(2);
        System.out.println(first);
    }
    static boolean isBadVersion(int version){
     if(version == 2){
        return true;
     }
     return false;
    }
    public static int firstBadVersion(int n) {
        int index = 0;
        int start = 0;
        int end = n;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(!isBadVersion(mid)){
                start = mid + 1;
            }
            else{
                index = mid;
                end = mid;
            }
        }
        return index;
    }
}
