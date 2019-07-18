package Generic;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildCard {

    private static Double add(List<? extends Number> num) {
        Double sum = 0.0;
        for (Number n : num) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(10,20);
        System.out.println(add(l1));

        List<Double> l2 = Arrays.asList(10.50, 20.40);
        System.out.println(add(l2));
    }
}
