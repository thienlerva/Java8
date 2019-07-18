package Generic;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCard {

    private static void addNumber(List<? super Integer> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        System.out.println("javatpoint.com/generics-in-java");

        List<Integer> l1 = Arrays.asList(1,2,3);
        addNumber(l1);

        List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
        addNumber(l2);
    }
}
