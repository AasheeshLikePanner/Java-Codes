package OOPS;

class A{
    public static void play(){
        System.out.println("Playing Gta 5");
    }
    public void eat(){
        System.out.println("eat");
    }
}
class B extends A{
    final int a = 12;
//    @Override
    public static void play(){
        System.out.println("I am playing Rdr 2.");
    }
    public String toString(){
        return "I am in B class";
    }
    public void eat(){
        System.out.println("snacks");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
       A a = new B();
       a.play();

    }
}
