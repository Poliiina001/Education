package Tasks;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        System.out.println("--Task 5.4--");
        int[] arrNum = {5, 2, 101, 234, 12, 10, 5533, 4};
        Arrays.sort(arrNum);
        System.out.println("Sorted arrays in ascending order: " + Arrays.toString(arrNum));
    }
}