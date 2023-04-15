package Contest;

public class CountTheNumberOfVowels {
    public static void main(String[] args) {
        String[] can1 = {"hey","aeo","mu","ooo","artro"};
        String[] can2 ={"are","amy","u"};
        System.out.println(vowelStrings(can2, 0 , 2));
    }
    public static int vowelStrings(String[] words, int left, int right) {
        int l = words.length;
        int count = 0;
        for(int i =left  ;i<= right ; i++){
           String ch = words[i];
            if((ch.startsWith("a") || ch.startsWith("e") || ch.startsWith("i") || ch.startsWith("o") || ch.startsWith("u"))){
                if(ch.endsWith("a") || ch.endsWith("e") || ch.endsWith("i") || ch.endsWith("o") || ch.endsWith("u")){
                    count+=1;
                }
            }
        }
        return count;
    }
}
