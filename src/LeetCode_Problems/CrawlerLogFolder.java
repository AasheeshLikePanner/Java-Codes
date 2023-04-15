package LeetCode_Problems;

import java.util.Stack;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] test1 = {"d1/","d2/","../","d21/","./"};
        String[] test2 = {"d1/","d2/","./","d3/","../","d31/"};
        String[] test3 = {"d1/","../","../","../"};
        System.out.println(minOperations(test2));
    }
    public static int minOperations(String[] logs) {
        Stack<String> can= new Stack<>();
        for(String man: logs){
            if(man.equals("../")){
                if(!can.isEmpty()){
                    can.pop();
                }
            }
            else if(man.equals("x/")){
                while(can.peek().equals("x")){
                    can.pop();
                }
            }
            else if(man.equals("./")){
                continue;
            }
            else{
                can.add(man);
            }
        }
        int count= 0;
        while(!can.isEmpty()){
            count++;
            can.pop();
        }
        return count;
    }
}
