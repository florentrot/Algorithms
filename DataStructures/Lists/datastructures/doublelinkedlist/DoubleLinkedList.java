package datastructures.doublelinkedlist;

import datastructures.entity.Employee;

/**
 * I use it when insert/delete in the front of the List (constant time complexity)
 * |value|NODE->|value|NODE->|value|NODE->null
 */
public class DoubleLinkedList {
    public static void main(String[] args) {

        Employee employee1 = new Employee("jane", "jones", 123);
        Employee employee2 =new Employee("john", "doe", 45);
        Employee employee3 =new Employee("mary", "smith", 200);
        Employee employee4 =new Employee("mike", "wilson", 22);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);
        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 77);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

    }
}
