
public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(4));
        System.out.println(iterativeFactorial(4));
        System.out.println(myRecursion(20,25));
    }

    // 1! = 0! * 1 = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!
    //  ..........................
    // n! = n * n-1 * ....... 1 = n * (n-1)!

        //callstack
    // 5 recursiveFactorial(0)   6
    // 4 recursiveFactorial(1)   7
    // 3 recursiveFactorial(2)   8
    // 2 recursiveFactorial(3)   9
    // 1 recursiveFactorial(4)   0

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <=num ; i++) {
            factorial*=i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num*recursiveFactorial(num-1);

    }

    public static int myRecursion(int no1, int no2) {

        if(no1==no2) {
            return 1;
        }

        if(no1<no2) {
            no1++;
            System.out.println(no1); //for check
        } else {
            no2++;
            System.out.println(no2);
        }
        return myRecursion(no1,no2);
    }

}
