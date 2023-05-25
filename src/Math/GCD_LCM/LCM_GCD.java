package Math.GCD_LCM;

public class LCM_GCD {
    public static void main(String[] args) {
        System.out.println(lcm(15,6));
    }
    public static int lcm(int one , int two){
        return (one*two)/gcd(one,two);
    }
    public static int gcd(int one , int two){
        return (two == 0)?  one: gcd(two , one % two);
    }
}
