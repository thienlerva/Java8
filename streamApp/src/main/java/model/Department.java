package model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Department {

    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }
}
