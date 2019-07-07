package predicate;

import com.google.common.base.Preconditions;
import model.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PredicateDemo {



    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30, 30000.00);
        Employee jane = new Employee("Jane Deer", 25, 25000.00);
        Employee jack = new Employee("Jack Hill", 40, 40000.00);
        Employee snow = new Employee("Snow White", 22, 22000.00);

        List<Employee> employees = Arrays.asList(john, jane, jack, snow);

//        Predicate<Employee> employeePredicate = new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge() > 25;
//            }
//        };

        System.out.println("Predicate take input, and return value");
        Predicate<Employee> employeePredicate = employee -> employee.getAge() > 25;

        printEmployeeByAge(employees, "older than 25", employeePredicate);
        printEmployeeByAge(employees, "younger than 25", employee -> employee.getAge()<25);
        printEmployeeByAge(employees, "older than 20", employee -> employee.getAge() > 20);

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;

        System.out.println(greaterThan15.and(lessThan100).test(20));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(sumWithCondition(numbers, n -> true));
        System.out.println(sumWithCondition(numbers, i -> i % 2 == 0));

        System.out.println("-----Apply binary operator using lamda-----");
        System.out.println(calculateBinaryOperation(2,5, (a, b) -> a + b));
        System.out.println(calculateBinaryOperation(5,2, (a, b) ->  Math.round(a / b)));
        System.out.println(calculateBinaryOperation(2,2, (a, b) -> a / b));


        System.out.println("--Supplier has no input, but return value-------");
        Random random = new Random();
//        Supplier<Integer> randomSupplier = new Supplier<Integer>() {
//            @Override
//            public Integer get() {
//                return random.nextInt(1000);
//            }
//        };
        Supplier<Integer> randomSupplier = () -> random.nextInt(100);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }
    }

    private static void printEmployeeByAge(List<Employee> employees,
                                           String textAge, Predicate<Employee> ageCondition) {

        employees.forEach(employee -> {
            if (ageCondition.test(employee)) {
                System.out.println("Employee " + textAge + " " + employee);
            }
        });
    }

    static List<Employee> getEmployeeByAge(List<Employee> employees,
                                           String textAge, Predicate<Employee> ageCondition) {
        return employees.parallelStream()
                .filter(ageCondition)
                .collect(Collectors.toList());
    }

    static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.parallelStream()
                .filter(predicate)
                .mapToInt(Integer::intValue)
                .sum();
    }

    static int calculateBinaryOperation(int a, int b, BinaryOperator<Integer> operator) {
        Preconditions.checkArgument(b > 0, "Cannot divide by {}", b);
        return operator.apply(a,b);
    }
}
