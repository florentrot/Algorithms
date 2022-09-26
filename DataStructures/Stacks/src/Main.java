import entity.Employee;

public class Main {
    /**
     * LIFO - last in, first out
     * push - add on the top
     * pop - remove from the top
     * peek - get the top item without popping it
     * Ideal backing data structure: liked list
     * O(1) time complexity with linked list
     * 0(n) time complexity with array (good when I know the maximum number of items) for random access
     */
    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(20);
        Employee employee1 = new Employee("Ion", "Ionescu", 55);
        Employee employee2 = new Employee("Gigi", "Gigescu", 550);
        Employee employee3 = new Employee("Cata", "Calinescu", 22);

        arrayStack.push(employee1);
        arrayStack.push(employee2);
        arrayStack.push(employee3);

        arrayStack.printStack();
        System.out.println();
        System.out.println("Popped: "+ arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println();
        arrayStack.printStack();

        LinkedStack stack = new LinkedStack();
        stack.push(employee1);
        stack.push(employee2);
        stack.push(employee3);
        stack.printStack();

    }
}
