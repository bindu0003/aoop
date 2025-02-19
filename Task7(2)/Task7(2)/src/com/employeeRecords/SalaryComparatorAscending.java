package com.employeeRecords;
import java.util.*;
class SalaryComparatorAscending implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}