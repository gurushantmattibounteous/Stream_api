package salary;

import java.util.*;
import java.util.stream.*;

public class sort_demo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 70000),
                new Employee("John", 60000),
                new Employee("Bob", 45000));

        List<Employee> sorted = employees.stream()
                .sorted(Comparator
                        .comparing(Employee::getName)
                        .thenComparing(Employee::getSalary))
                .toList();

        sorted.forEach(System.out::println);
    }
}