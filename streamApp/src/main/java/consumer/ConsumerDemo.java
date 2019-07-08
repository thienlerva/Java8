package consumer;

import sun.rmi.server.InactiveGroupException;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<Integer> consumer1 = i -> System.out.println(i);
        consumer1.accept(10);

        Stream.of(1,23,4).forEach(consumer1);

        getConsumer(consumer1, 2);
    }

    private static void getConsumer(Consumer<Integer> con, Integer i) {
        con.accept(i);
    }
}
