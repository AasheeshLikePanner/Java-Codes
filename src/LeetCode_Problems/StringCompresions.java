package LeetCode_Problems;

public class StringCompresions {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int man = helper(chars);
        int i =0 ;
        for(char ch: result){
            chars[i] =ch;
            i++;
        }
        return man;
    }
    static char[] result;
    public static int helper(char[] can){
        int index= 0;
        int count = 0;
        int i = 0;
        int j =0 ;
        result  = new char[can.length];
        while(j < can.length){
            if(can[i] == can[j]){
                count++;
                j++;
            }
            else{
                result[i] = can[i];

                i++;
                if(count > 1) {
                    if (count >= 10) {
                        int num = 0;
                        while (count > 0) {
                            int rem = count % 10;
                            num = num * 10 + rem;
                            count = count / 10;
                        }
                        char countChar = (char) (num + '0');
                        result[i] = countChar;
                    }
                }
                    else{

                        char countChar = (char)(count+'0');
                        result[i ] = countChar;
                    }

                count = 0;
                i = j;
            }
        }
        result[i] = can[i];
        i++;
        if(count > 1){
            if(count >= 10){
                i += count / 10;
                int num = 0 ;
                while(count > 0){
                    int rem = count % 10;
                    num = num *10  + rem;
                    char countChar = (char)(num+'0');
                    if(countChar == 'E') {

                        result[i ] = '1';
                    }
                    else{

                        result[i ] = countChar;
                    }
                    count = count/10;
                    i--;
                }
            }
            else{

                char countChar = (char)(count+'0');
                result[i ] = countChar;
            }

        }
        return i + 1;
    }

}
