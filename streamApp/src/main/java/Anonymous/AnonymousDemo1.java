package Anonymous;

public class AnonymousDemo1 {

    public static void main(String[] args) {
        // Myclass is hidden inner class of Age inteface
        //whose name is not written but an obj is created
//        Age obj = new Age() {
//            @Override
//            public void getAge() {
//                System.out.println("Age is " + x);
//            }
//        };

        //replace with lambda expression
        Age obj = () -> System.out.println("Age is " + Age.x);
        obj.getAge();
    }
}
