package LeetCode_Problems;

public class PrimeSubtractionOperation {

    static int[] prime = { 2,3,
            5,
            7,
            11,
            13,
            17,
            19,
            23,
            29,
            31,
            37,
            41,
            43,
            47,
            53,
            59,
            61,
            67,
            71,
            73,
            79,
            83,
            89,
            97,
            101,
            103,
            107,
            109,
            113,
            127,
            131,
            137,
            139,
            149,
            151,
            157,
            163,
            167,
            173,
            179,
            181,
            191,
            193,
            197,
            199,
            211,
            223,
            227,
            229,
            233,
            239,
            241,
            251,
            257,
            263,
            269,
            271,
            277,
            281,
            283,
            293,
            307,
            311,
            313,
            317,
            331,
            337,
            347,
            349,
            353,
            359,
            367,
            373,
            379,
            383,
            389,
            397,
            401,
            409,
            419,
            421,
            431,
            433,
            439,
            443,
            449,
            457,
            461,
            463,
            467,
            479,
            487,
            491,
            499,
            503,
            509,
            521,
            523,
            541,
            547,
            557,
            563,
            569,
            571,
            577,
            587,
            593,
            599,
            601,
            607,
            613,
            617,
            619,
            631,
            641,
            643,
            647,
            653,
            659,
            661,
            673,
            677,
            683,
            691,
            701,
            709,
            719,
            727,
            733,
            739,
            743,
            751,
            757,
            761,
            769,
            773,
            787,
            797,
            809,
            811,
            821,
            823,
            827,
            829,
            839,
            853,
            857,
            859,
            863,
            877,
            881,
            883,
            887,
            907,
            911,
            919,
            929,
            937,
            941,
            947,
            953,
            967,
            971,
            977,
            983, 991, 997,};
    public static void main(String[] args) {
        int [] can = {4,9,6,10};
        int[] can2 = {8,19,3,4,9};
        System.out.println(primeSubOperation(can2));
    }
    public static boolean primeSubOperation(int[] nums) {
        int j =0;
        int can = 0;
        int one = 0;
        int two = 2;
        while (true) {
            can = nums[0] - prime[j];

            if ((can < 0 && j > 0)) {
                nums[0] -= prime[j - 1];
                break;
            } else if (can > nums[1] && can > 0) {
                j++;
            }
            else if(can < 0 && j == 0){
                break;
            }
            else if(can > 0){
                j++;
            }
            else if(can == 1){
                nums[0] = 1;
            }
            else if(can == 0 ){
                if(j > 0){
                    nums[0] -= prime[j - 1];
                }
                break;
            }
        }
        for(int i = 1 ;i< nums.length - 1; i++){
            j = 0;
            if(nums[i] < nums[one]){
                return false;
            }
            else {
                while (true) {
                    can = nums[i] - prime[j];
                    if (can <= nums[one] && j > 0) {
                        nums[i] -= prime[j - 1];
                        break;
                    }
                    else if(can == nums[one] && can < nums[i]){
                        if(j > 0){
                            nums[i] -=prime[j - 1];
                        }
                                break;
                    }
                    else if ((can < 0 && j > 0)) {
                        nums[0] -= prime[j - 1];
                        break;
                    } else if (can > nums[one] && can > 0) {
                        j++;
                    }
                    else if(can < nums[one] ){

                        break;
                    }
                    else if(can < 0 && j == 0){
                        break;
                    }
                }
                j  =0;
                one++;
            }
        }
        for(int i = 1 ; i < nums.length ; i++ ){
            if(nums[i] <= nums[i - 1]){
                return false;
            }
        }
        return true;
    }
}
