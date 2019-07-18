package Stream;

import model.Employee;
import model.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ComparatorEx {

//    public static void main(String[] args) {
//
//        Employee employee1 = new Employee("Thien", 38, 55000.00);
//        Employee employee2 = new Employee("Nga", 27, 30000.00);
//        Employee employee3 = new Employee("Self", 18, 20000.00);
//
//        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
//
//        Comparator<Employee> nameComparator = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
//
//        // reverse order
//        Comparator<Employee> reverseNameComparator = Comparator.comparing(Employee::getName).reversed();
//        //employees.sort(nameComparator);
//        Collections.sort(employees, reverseNameComparator);
//    }
//
//    private Employee getEmployeeInfo(Student student) {
//        Employee employee = new Employee();
//        employee.setName(student.getName());
//        return employee;
//    }
//
//    //first way to convert one type to another
//    List<Employee> getEmployee(List<Student> students) {
//        return students.stream().map(this::getEmployeeInfo).collect(toList());
//    }
//
//    //second way
//    List<Employee> getEmployee1(List<Student> students) {
//        return students.stream().map(student -> {
//            Employee employee = new Employee();
//            employee.setName(student.getName());
//            return employee;
//        }).collect(Collectors.toList());
//    }
//
//    List<Employee> getEmployee2(List<Student> students) {
//        return students.stream().map(student -> {
//            String name = student.getName() != null ? student.getName() : null;
//            return new Employee(name, 30, 2000.00);
//        }).collect(Collectors.toList())
//    }
}
