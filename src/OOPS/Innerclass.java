package OOPS;

public class Innerclass {
    class test {
        String name;
        test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Innerclass outer = new Innerclass();
        Innerclass.test t1 = outer.new test("Aniket");
        Innerclass.test t2 = outer.new test("Aasheesh");
    }
}
