package Generic;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3);
        display(l1);

        List<String> l2 = Arrays.asList("One", "Two", "Three");
        display(l2);
    }


    private static void display(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
