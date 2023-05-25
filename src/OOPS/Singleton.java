package OOPS;
class single{
    private static single instance = new single();
    private single(){}
    public static single getInstance(){
        return instance;
    }
}
public class Singleton {
    public static void main(String[] args) {
        single obj =  single.getInstance();
    }
}
