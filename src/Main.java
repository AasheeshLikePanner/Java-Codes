
public class Main {
    public static void main(String[] args) {
        System.out.println((0 - 1 + 4) % 4);
    }
    static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}