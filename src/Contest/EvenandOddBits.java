package Contest;

import java.util.Arrays;

public class EvenandOddBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddBit(2)));
    }
    public static int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        int can = Integer.parseInt(s);

        int[] arr = new int[2];
        int index = 0;
        char[] man = String.valueOf(can).toCharArray();
        for (int i = man.length - 1; i >= 0; i--) {
            if(index % 2 == 1 && man[i] == '1'){
                arr[1] +=1;
            }
            else if(index%2 == 0 && man[i] == '1'){
                arr[0] += 1;
            }
            index++;
        }
        return arr;
    }
}
