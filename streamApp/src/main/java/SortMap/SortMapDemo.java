package SortMap;

import model.Employee;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Three", 3);
        map.put("One", 1);
        map.put("Four", 4);
        map.put("Two", 2);


        System.out.println(map.size() + " " + map.entrySet());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key :" + entry.getKey() + " has value: " + entry.getValue());
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        System.out.println(list);

        Set<Map.Entry<String, Integer>> set = new HashSet<>(map.entrySet());

        System.out.println(set);

        // sort by key
        Comparator<Map.Entry<String, Integer>> keyComparator = Comparator.comparing(Map.Entry::getKey);
        list.sort(keyComparator);
        System.out.println(list + "\n");

        // sort by value
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        // Sort by object
        System.out.println("************");
//        Map<Employee, String> employeeMap = new TreeMap<>(new ComparatorEx<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Map<Employee, String> employeeMap = new TreeMap<>((e1, e2) -> e1.getName().compareTo(e2.getName()));
        employeeMap.put(new Employee("Roshan", 30, 30000.00), "Roshant");
        employeeMap.put(new Employee("Bikash", 20, 45000.00), "Bikash");
        employeeMap.put(new Employee("Prakash", 45, 15000.00), "Prakash");

        System.out.println(employeeMap);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
            .forEach(System.out::println);

    }
}
