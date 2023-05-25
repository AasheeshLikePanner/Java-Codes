package OOPS;

class Human{
    private String food;
    public void eat(String food){
        this.food = food;
        digest();
    }
    private void digest(){
        System.out.println(food + " digested");
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human aniket = new Human();
        aniket.eat("burger");
    }
}
