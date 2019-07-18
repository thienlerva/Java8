package Optional;

import java.awt.*;
import java.util.*;
import java.util.List;

public class OptionalDemo {

    public static void main(String[] args) {

        String str = "Hello";

        Optional<String> opt1 = Optional.of(str);
        System.out.println(opt1.isPresent());

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        String name = "Anthony";
        Optional<String> opt2 = Optional.ofNullable(name);
        System.out.println(opt2.isPresent());


        Optional<String> opt3 = Optional.of("Jennifer");
        opt3.ifPresent(n -> System.out.println(n.length()));

        String nullName = null;
        String name3 = Optional.ofNullable(nullName).orElse("John");
        System.out.println(name3);

//        String nullName2 = null;
//        String name4 = Optional.ofNullable(nullName2).orElseThrow(IllegalArgumentException::new);

        Optional<String> opt5 = Optional.of("Anthony");
        String name5 = opt5.get();
        System.out.println(name5);

        Map<Color, Integer> colorIntegerMap = new HashMap<>();

        colorIntegerMap.put(Color.yellow, 1);
        colorIntegerMap.put(Color.green, 2);
        colorIntegerMap.put(Color.BLACK, 1);

        System.out.println(colorIntegerMap.size());

        for (Map.Entry<Color, Integer> entry : colorIntegerMap.entrySet()) {
            System.out.println("Color: " + entry.getKey() + "\n" + "Value: " + entry.getValue());
        }

        Set<Map.Entry<Color, Integer>> set = colorIntegerMap.entrySet();

        System.out.println(set);

        String password = "password";
        Optional<String> opt4 = Optional.ofNullable(password);
        System.out.println(opt4.filter(p -> p.equals("password")).isPresent());
        opt1.ifPresent(System.out::println);

        List<String> list = Arrays.asList("How", "are", "you");
        Optional<String> testNull = list.stream().filter(x -> x.length() > 2).findFirst();
        System.out.println(testNull);
        testNull.ifPresent(System.out::println);
    }
}
