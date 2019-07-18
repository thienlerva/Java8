package Exception;

import com.google.common.base.Preconditions;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Precondition {

//    public static void main(String[] args) {
//
//        try {
//            System.out.println(Integer.parseInt("ab"));
//
//        } catch (NumberFormatException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("continue flow");
//        System.out.println(checkAge(19));
//        System.out.println(Math.toIntExact(Long.MIN_VALUE));
//    }
//
//    static double sqrt(double value) {
//        Preconditions.checkArgument(value >= 0.0, "negative value: %s", value);
//
//        return Math.sqrt(value);
//    }
//
//    static double sqrt2(double value) {
//        Double result = 0.0;
//
//        try {
//            return = Math.sqrt(value);
//        }catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    static void input(@NotNull String value) {
//        if (value == null) {
//            throw new NullPointerException("can't be null");
//        }
//        System.out.println(value.length());
//    }
//
//    static Integer add(int a, int b) {
//        Integer result;
//
//        try {
//            result = a/b;
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//            return null;
//        }
//        return result;
//    }
//
//    static void example(List<Object> objects) {
//        Preconditions.checkArgument(objects != null, "List must not be null");
//        Preconditions.checkArgument(!objects.isEmpty(), "List must not be empty");
//    }
//
//    static String checkAge(Integer age) {
//        Preconditions.checkNotNull(age, "can't be null");
//        Preconditions.checkArgument(age>18, "have over %s", age);
//    }
}
