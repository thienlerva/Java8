package Anonymous;

public class Demo1 {


    public static void main(String[] args) {
        Age age = new MyClass();
        age.getAge();
    }
}

interface Age {
     Integer x = 21;
     void getAge();
}

// Myclass implements Age interface
class MyClass implements Age {

    @Override
    public void getAge() {
        System.out.println("Age is " + x);
    }
}
