package OOPS;

class animal{
    animal(){
        System.out.println("I am in animal");
    }
    void eat(){
        System.out.println("eating");
    }
    void sleep(){
        System.out.println("sleeping");
    }
}
//class human extends dog{
//    void love(){
//        System. out.println("I can feel love.");
//    }
//}
class dog extends animal{
    dog() {
        super();
    }
    void run() {
        System.out.println("running");
    }
}
public class Inheritance {
    public static void main(String[] args) {
//        human h = new human();
//        h.run();
//        h.eat();

    }
}
