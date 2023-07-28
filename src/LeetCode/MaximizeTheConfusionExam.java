package LeetCode;

public class MaximizeTheConfusionExam {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers("FFFTTFTTFT", 3));
    }
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int max = 0;
        int i = 0, j = 0, count  = 0;
        while(j < answerKey.length()){
            if(answerKey.charAt(j) == 'F'){
                count++;
            }
            while(count > k){
                if( answerKey.charAt(i++) == 'F'){
                    count--;
                }
            }
            max = Math.max(j - i + 1, max);
            j++;
        }
        i = 0;
        j = 0;
        count = 0;
        while(j < answerKey.length()){
            if(answerKey.charAt(j) == 'T'){
                count++;
            }
            while(count > k){
                if( answerKey.charAt(i++) == 'T'){
                    count--;
                }
            }
            max = Math.max(j - i + 1, max);
            j++;
        }
        return max;
    }
}
