package LeetCode_Problems;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 =
                "999",num2 =
                "999";
        System.out.println(multiply(num1,num2));
    }
    public static String multiply(String num1, String num2) {      // num1 = "123", num2 = "456"
        if(num1.length() < 3 && num2.length() < 3){
            return Integer.toString(Integer.parseInt(num1) * Integer.parseInt(num2));
        }
        String result = "";
        int carry = 0;
        int step = 1;
        for(int i = num2.length() - 1 ; i >= 0 ;i--){
            StringBuilder temp = new StringBuilder();
            for(int j = num1.length() - 1; j >= 0 ; j--){
                int mul = (num2.charAt(i) - 48) * (num1.charAt(j) - 48);
                String rem = "";
                if(mul > 9){
                    temp.insert(0,Integer.toString(mul%10 + carry));
                    carry = mul/10;
                }
                else{
                    temp.insert(0, Integer.toString(mul + carry));
                    carry = 0;
                }
            }
            StringBuilder check = new StringBuilder();
            if(result.equals("")){
                result = temp.toString();
            }
            else{
                check.insert(0,result.substring(result.length() - step ,result.length() ));
                int one = result.length() - step - 1 ;
                int two = temp.length() - 1;
                int carry2 = 0;
                while(one >= 0 && two >= 0){
                    int sum = (temp.charAt(two) - 48) + (result.charAt(one) - 48) + carry2;
                    if(sum > 9){
                        check.insert(0,sum % 10);
                        carry2 = sum/10;
                    }
                    else{
                        check.insert(0,sum);
                        carry2 = 0;
                    }
                    one--;
                    two--;
                }
                step++;
                if(two < 0 ){
                    result = Integer.toString(temp.charAt(0)-48 + 1) + check;
                }
                else if(carry2 != 0){
                    result = Integer.toString(temp.charAt(0)-48 + 1) + temp.substring(1 , two + 1)+ check;
                }
                else {
                    result = temp.substring(0 , two + 1)+ check.toString();
                }
            }
        }
        return result;
    }
}
