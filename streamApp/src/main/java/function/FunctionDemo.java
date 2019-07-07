package function;

import model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30, 30000.00);
        Employee jane = new Employee("Jane Deer", 25, 25000.00);
        Employee jack = new Employee("Jack Hill", 40, 40000.00);
        Employee snow = new Employee("Snow White", 22, 22000.00);

        List<Employee> employees = Arrays.asList(john, jane, jack, snow);

        /**
         * Function<T, R> takes 2 argument, return R
         */
        Function<Employee, String> getLastName = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getName().substring(employee.getName().indexOf(' ') + 1);
            }
        };
        //System.out.println(getLastName.apply(employees.get(1)));

//        Function<Employee, String> getFirstName = (Employee employee) -> {
//            return employee.getName().substring(0, employee.getName().indexOf(' '));
//        };
        Function<Employee, String> getFirstName = employee -> employee.getName()
                .substring(0, employee.getName().indexOf(' '));
        //System.out.println(getFirstName.apply(employees.get(1)));

        Random random = new Random();
        for (Employee employee : employees) {
            if (random.nextBoolean()) {
                System.out.println(employee + " , first name: " + getAName(getFirstName, employee));
            } else {
                System.out.println(employee + " , last name: " + getAName(getLastName, employee));
            }
        }
    }

    private static String getAName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }
}
