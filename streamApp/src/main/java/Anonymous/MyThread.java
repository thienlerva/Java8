package Anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyThread {

    public static void main(String[] args) {

        String str = "Hello";
        str = "hi";
        System.out.println(str);

        Integer[] a = new Integer[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        int[] ints = new int[3];
        ints[0] = 1;

        int[] ints1 = {2,4,6};

        Arrays.stream(a).forEach(System.out::println);
        Stream.of(a).forEach(System.out::println);

        IntStream intStream = Arrays.stream(ints);
        intStream.forEach(System.out::println);

        Stream<int[]> temp = Stream.of(ints1);
        //IntStream intStream1 = temp.flatMapToInt(x -> Arrays.stream(x));
        IntStream intStream1 = temp.flatMapToInt(Arrays::stream);
        intStream1.forEach(System.out::println);

        //Here using inner class that implements Runnable interface
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };

        Runnable r = () -> {
            Thread.currentThread().setName("Thread 1");

            for (int i = 0 ; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
        System.out.println("Main thread");
    }
}
