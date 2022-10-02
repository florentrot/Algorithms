import entity.Employee;

/**
 * FIFO - First in, first out
 * add() an item to the end of the queue - enqueue
 * remove() from the front of the queue - dequeue
 * peek() get item at the front of the queue
 * O(1) - if no need resize
 * O(n) - if resize the queue
 * Queue works with LinkedList and DoubleLinkedLIst
 */

public class MainQueues {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jane", "Jones", 123);
        Employee employee2 = new Employee("John", "Doe", 3333);
        Employee employee3 = new Employee("Mary", "Smith", 2);
        Employee employee4 = new Employee("Mike", "Wilson", 3321);
        Employee employee5 = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(employee1);
        queue.add(employee2);
        queue.add(employee3);
        queue.add(employee4);
        queue.add(employee5);
        //queue.printQueue();

        queue.remove();
        queue.remove();
        //queue.printQueue();
        System.out.println(queue.peek());


    }
}
