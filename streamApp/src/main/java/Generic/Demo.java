package Generic;

public class Demo {

    public static void main(String[] args) {

        Test<Integer> iObj = new Test<>(15);
        System.out.println(iObj.getObject());

        Test<String> sObj = new Test<>("GeekSquad");
        System.out.println(sObj.getObject());

        Test2<String, Integer> obj = new Test2<>("GfG", 15);
        obj.print();

        Test3.generateDisplay(11);
        Test3.generateDisplay("GeekForGeek");
        System.out.println(Test3.getValue(12.00));
        System.out.println(Test3.getValue("Hello"));
    }

}

class Test<T> {
    T obj;

    public Test(T obj) { this.obj = obj; }

    public T getObject() { return this.obj; }
}

class Test2<T, U> {
    T obj1;
        U obj2;

        public Test2(T obj1, U obj2) {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }

        public void print() {
            System.out.println(obj1);
            System.out.println(obj2);
        }
}

class Test3 {
    static <T> void generateDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    static <T> T getValue(T element) { return element; }
}
