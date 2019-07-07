package flatMapReduce;

import model.Department;
import model.Employee;
import org.springframework.util.CollectionUtils;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30, 30000.00);
        Employee jane = new Employee("Jane Deer", 25, 25000.00);
        Employee jack = new Employee("Jack Hill", 40, 40000.00);
        Employee snow = new Employee("Snow White", 25, 22000.00);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream().forEach(System.out::println);

        System.out.println("**********Using flat map************");
        //Using flat map
        departments.stream()
                .filter(employee -> CollectionUtils.isEmpty(employee.getEmployees()))
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("*****Second way of flatmap********");
        departments.stream()
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println("********Map******");
        // Using Map
        Map<Integer, List<Employee>> groupByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getAge));

        System.out.println(groupByAge);

        System.out.println("*******Reduce*******");
        // Reduce
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Optional<Employee> opt = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2);

        if (opt.isPresent()) {
            System.out.println(opt.get());
        }

        Integer[] integers = {3,2,5,4};
        Arrays.stream(integers).filter(Objects::nonNull)
                .filter(i -> i % 2 ==0)
                .findAny().ifPresent(System.out::println);
        Stream.of(3,5,1,2).reduce(Math::max).ifPresent(System.out::println);

    }
}
