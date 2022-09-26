package datastructures.jdklinkedlist;

import datastructures.entity.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("jane", "jones", 123);
        Employee employee2 =new Employee("john", "doe", 45);
        Employee employee3 =new Employee("mary", "smith", 200);
        Employee employee4 =new Employee("mike", "wilson", 22);
        Employee employee5 =new Employee("bill", "end", 77);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(employee1); // add to Front
        list.addFirst(employee2);
        list.addFirst(employee3);
        list.addFirst(employee4);

        Iterator iter = list.iterator();
        System.out.print("HEAD ->");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

//        list.add(employee5); //add to the End
        list.addLast(employee5); // same like previous line

        list.removeFirst();
        list.removeLast();


//        for (Employee employee:list) {
//            System.out.println(employee);
//        }

    }
}
