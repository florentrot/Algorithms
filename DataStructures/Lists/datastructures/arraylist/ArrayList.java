package datastructures.arraylist;

import datastructures.entity.Employee;

import java.util.List;

/**
 * if I don't need synchronization I use datastructures.arraylist.ArrayList
 * constant time complexity when I know the index
 */
public class ArrayList {
    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.ArrayList<>();

        employeeList.add(new Employee("jane", "jones", 123));
        employeeList.add(new Employee("john", "doe", 45));
        employeeList.add(new Employee("mary", "smith", 200));
        employeeList.add(new Employee("mike", "wilson", 22));

//        employeeList.forEach(System.out::println);
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("john", "addams", 4445));

        employeeList.add(3, new Employee("Jika", "Mike", 333));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.size());

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee:employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("mary", "smith", 200)));
        System.out.println(employeeList.indexOf(new Employee("john", "addams", 4445)));

        employeeList.remove(2);
        employeeList.forEach(System.out::println);
    }
}
