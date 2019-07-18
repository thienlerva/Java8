package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5);

        Optional<Integer> total = num.stream().reduce((a, b) -> a + b);
        System.out.println(total);

        Stream.of(3,5,1,2).reduce(Math::max).ifPresent(System.out::println);
    }
}
