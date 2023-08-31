package LeetCode;

public class MaximumValueAfterInsertions {
    public static void main(String[] args) {
        System.out.println(maxValue("-13",2));
        System.out.println(maxValue("123",4));
    }
    public static String maxValue(String n, int x) {
        boolean flag = true;
        if(n.charAt(0) == '-'){
            flag = false;
        }

        StringBuilder res = new StringBuilder();

        if(flag){
            for(int i = 0; i < n.length(); i++){
                if(Integer.parseInt(String.valueOf(n.charAt(i))) < x){
                    res.append(n.substring(0, i ));
                    res.append(String.valueOf(x));
                    res.append(n.substring(i));
                    return res.toString();
                }
            }
            res.append(n);
            res.append(String.valueOf(x));
            return res.toString();
        }
        if(!flag){
            for(int i = n.length() - 1; i >= 0; i--){
                if(Integer.parseInt(String.valueOf(n.charAt(i))) > x){
                    res.append(n.substring(0, i ));
                    res.append(String.valueOf(x));
                    res.append(n.substring(i ));
                    return res.toString();
                }
            }
            res.append(n);
            res.append(String.valueOf(x));
            return res.toString();
        }
        return "";
    }
}
