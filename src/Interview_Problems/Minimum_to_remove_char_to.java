package Interview_Problems;

public class Minimum_to_remove_char_to {
    public static void main(String[] args) {
        int min = min("geeksforgeeks");
        System.out.println(min);
    }
    public static int min(String s){       // a e b c b d a         // a b e d d d d b a
        int end = s.length() - 1;
        int start = 0;
        int count = 0;
        while(start < end ){
            char first = s.charAt(start);
            char last = s.charAt(end);

            if( first != last && (start + 1 <= end && s.charAt(start + 1) == s.charAt(end))){
                start +=2;
                end -=1;
                count +=1;
            }
            else if(first != last && (end  - 1 >=  start && s.charAt(start ) == s.charAt(end - 1))) {
                count+=1;
                end -=2;
                start +=1;
            }
            else if(first != last){
                count +=2;
                start +=1;
                end -=1;
            }
            else{
                start +=1;
                end -=1;
            }
        }
        return count;
    }
}
