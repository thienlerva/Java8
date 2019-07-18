package Interface;

public class Demo implements MyInterface {

    private Double balance;

    public Demo(Double balance) {this.balance = balance;}

    public void addMoney(Double n) {
        if (n < 0) {
            throw new IllegalArgumentException("Can't be less than 0 " + n);
        }
        balance += n;
    }

    public Double getBalance() { return balance;}

    public static void main(String[] args) {

        MyInterface demo1 = new Demo(100.00);
        demo1.addMoney(-50.00);
        demo1.print();
        System.out.println(((Demo) demo1).getBalance());
    }
}


interface MyInterface {

    void addMoney(Double amount);

    default void print() {
        System.out.println("This is my first interface");
    }
}
