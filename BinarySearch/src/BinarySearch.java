/**
 * I think that time complexity in worst case will be O(n/2)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] myArray = {-22,-15,1,7,20,35,55};

//        System.out.println(iterativeBinarySearch(myArray, -15));
//        System.out.println(iterativeBinarySearch(myArray, -22));
//        System.out.println(iterativeBinarySearch(myArray, 100));

        System.out.println(recursiveBinarySearch(myArray, -15));
        System.out.println(recursiveBinarySearch(myArray, 20));
        System.out.println(recursiveBinarySearch(myArray, 100));
    }

    /**
     * Simple way to search in a sorted array
     */
    public static int iterativeBinarySearch(int[] input, int value) {
        int start=0;
        int end =input.length;

        while(start<end) {
            int midpoint=(start+end)/2;
            System.out.println("midpoint = " +midpoint); //just to be sure that I understand
            if(input[midpoint]==value) {
                return midpoint;
            } else if (input[midpoint]<value) {
                start =midpoint+1;
            } else {
                end=midpoint;
            }
        }
        return -1;
    }

    /**
     * I don't like it because it is more complex.
     * Let's keep things simple and use the iterativeBinarySearch... the previous one
     * The next one is just for brain warming
     */

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }
    public static int recursiveBinarySearch(int[] input, int start, int end,int value) {
        if(start>=end) {
            return -1;
        }
        int midpoint =(start+end)/2;
        System.out.println("midpoint = " + midpoint);
        if(input[midpoint]==value) {
            return midpoint;
        } else if(input[midpoint]<value) {
            return recursiveBinarySearch(input, midpoint+1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}
