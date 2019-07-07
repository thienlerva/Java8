package Singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();
    }
}

class Abc {

    public static Abc abc;

    private Abc() {
        System.out.println("Instance created");
    }

    public static Abc getInstance() {
        if (abc == null) {
            abc = new Abc();
        }
        return abc;
    }
}