package datastructures.linkedlist;

import datastructures.entity.Employee;

import java.util.List;

/**
 * I use it when insert/delete in the front of the List (constant time complexity)
 * |value|NODE->|value|NODE->|value|NODE->null
 */
public class LinkedList {
    public static void main(String[] args) {
        EmployeeLinkedList employeeList = new EmployeeLinkedList();
        employeeList.addToFront(new Employee("jane", "jones", 123));
        employeeList.addToFront(new Employee("john", "doe", 45));
        employeeList.addToFront(new Employee("mary", "smith", 200));
        employeeList.addToFront(new Employee("mike", "wilson", 22));

        employeeList.printList();
        System.out.println(employeeList.getSize());
        employeeList.removeFromFront();
        System.out.println(employeeList.getSize());

    }
}
