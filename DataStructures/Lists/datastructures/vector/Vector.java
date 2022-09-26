package datastructures.vector;

import datastructures.entity.Employee;

import java.util.List;

/**
 * if I need synchronization I use datastructures.vector
 */
public class Vector {
    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.Vector<>();
        /**
         * add method is synchronized
         */
        employeeList.add(new Employee("jane", "jones", 123));
        employeeList.add(new Employee("john", "doe", 45));
        employeeList.add(new Employee("mary", "smith", 200));
        employeeList.add(new Employee("mike", "wilson", 22));
    }
}
