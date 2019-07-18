package RegularExpression;

import org.springframework.security.core.parameters.P;

import java.util.regex.Pattern;

public class RegexMatches {

    public static void main(String[] args) {

        // . represents a single character
        System.out.println(Pattern.matches(".s", "as")); //true
        System.out.println(Pattern.matches(".s", "mk"));//false
        System.out.println(Pattern.matches("..s", "mas")); //true

        //Character class
        System.out.println(Pattern.matches("[amn]", "abcd")); //false
        System.out.println(Pattern.matches("[amn]", "a"));  //true
        System.out.println(Pattern.matches("[amn]", "ammna"));  //false

        //Quantifiers
        System.out.println("? quantifier ... zero or one time");
        System.out.println(Pattern.matches("[amn]?", "a")); //true a or m comes zero or one time
        System.out.println(Pattern.matches("[amn]?", "aa")); //false a comes moer than one time
        System.out.println(Pattern.matches("[amn]?", "aammnn")); //false a m and n comes more than one

        System.out.println("+ quantifier .. one ore more");
        System.out.println(Pattern.matches("[amn]+", "a")); //true a or m or n cone or more time
        System.out.println(Pattern.matches("[amn]+", "aaa")); //true a comes more than one time
        System.out.println(Pattern.matches("[amn]+", "aazzta")); //false z and t are not matching pattern

        System.out.println("* quantifier ... zero or more");
        System.out.println(Pattern.matches("[amn]*", "ammmna")); //true a or m or n may come zero or more times

        System.out.println("metacharacters d means digit");
        System.out.println(Pattern.matches("\\d", "abd")); //false non digit
        System.out.println(Pattern.matches("\\d", "1")); //true
        System.out.println(Pattern.matches("\\d", "1234")); //false digit come more than one time
        System.out.println(Pattern.matches("\\d", "323abd")); //false digit and char

        System.out.println("D mean no digit");
        System.out.println(Pattern.matches("\\D*", "mak")); //true non-digit and may come 0 or more times

        System.out.println("Create regex that accepts alphanumeric characters only, length must be 6 character long");
        System.out.println(Pattern.matches("[a-zA-Z0-0]{6}","abcd23")); //true
        System.out.println(Pattern.matches("\\w{6}", "abcd23")); //true
        System.out.println(Pattern.matches("\\d{3}[-|.]\\d{3}[-|.]\\d{4}", "123-123-1234"));
        System.out.println(Pattern.matches("\\d{3}[-|.|\\s]\\d{3}[-|.|\\s]\\d{4}", "123 123 1234"));
        System.out.println(Pattern.matches("[(]?\\d{3}[)]?[-.\\s]\\d{3}[-.\\s]?\\d{4}", "(123) 123 1234"));

        System.out.println("Create regex that accepts 10 digit, starting with 7,8,9 only");
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "78999999"));
        System.out.println(Pattern.matches("[dog]{3}", "god"));

        System.out.println(Pattern.matches("^[a-zA-Z0-9]+$", "Lookes123"));  //true
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+$", "2Lookes123")); //false not wanted
        System.out.println(Pattern.matches("^\\w{5}$", "343fa"));

        System.out.println("\n validate email");
        System.out.println(Pattern.matches("^(.*)[@](.*)[.](.*)$", "abc@yahoo.com"));
        System.out.println(Pattern.matches("^\\w*[@]$", "abc@"));
        System.out.println(Pattern.matches("(.*)[@](.*)[.][a-zA-Z]+$", "abd!@yahoo.com"));
        System.out.println(Pattern.matches("^\\w+[@]\\w*[.][a-zA-Z]+$", "@yahoo.com"));

        System.out.println("\n Password");
        System.out.println(Pattern.matches("\\w{6,10}", "adbfdfdfadfd"));  //limit 6-10
        System.out.println(Pattern.matches("(?=.*[a=z]).{3,4}", "aCa"));  // at least one lower case
        System.out.println(Pattern.matches("(?=.*[@#$%])(?=.*[A-Z]).{3,6}", "Ad#dfa"));
        System.out.println(Pattern.matches("(?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16}", "aA23#dgdd"));
    }
}
