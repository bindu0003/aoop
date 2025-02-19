package com.employeeRecords;
import java.util.*;
public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 60000));
        employees.add(new Employee(102, "Bob", "IT", 75000));
        employees.add(new Employee(103, "Charlie", "Finance", 65000));
        employees.add(new Employee(104, "David", "IT", 70000));
        employees.add(new Employee(105, "Eve", "HR", 62000));
        
        // Sorting by salary (ascending)
        employees.sort(new SalaryComparatorAscending());
        System.out.println("Sorted by salary (ascending):");
        employees.forEach(System.out::println);
        
        // Sorting by salary (descending)
        employees.sort(new SalaryComparatorDescending());
        System.out.println("\nSorted by salary (descending):");
        employees.forEach(System.out::println);
        
        // Sorting by name
        employees.sort(new NameComparator());
        System.out.println("\nSorted by name:");
        employees.forEach(System.out::println);
        
        // Sorting by department
        employees.sort(new DepartmentComparator());
        System.out.println("\nSorted by department:");
        employees.forEach(System.out::println);
    }
}