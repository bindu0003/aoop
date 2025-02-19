package com.employeeRecords;
import java.util.*;
class SalaryComparatorDescending implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}