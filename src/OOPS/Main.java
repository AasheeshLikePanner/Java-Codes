package OOPS;

class man{
    static {
        System.out.println("I am in the static block.");
    }
    static int a = 12;
}
public class Main {
    public static void main(String[] args) {
//        Main ma = new Main();
//        ma.greet();
//        man man= new man();
        System.out.println(man.a);
    }
    public void greet(){
        System.out.println("Namaste");
    }
}
