/**
 * time complexity O(n) worst case
 */

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {20,40,55,-15,7,1,-22};

        System.out.println(linearSearch(intArray,-15));
        System.out.println(linearSearch(intArray,40));
        System.out.println(linearSearch(intArray,100));
    }

    public static int linearSearch(int[] input, int value) {
        for(int i =0;i<input.length;i++) {
            if(input[i]==value) {
                return i;
            }
        }
        return -1;
    }
}
