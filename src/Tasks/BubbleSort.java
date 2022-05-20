package Tasks;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        if (count > 0) {
            bubbleSort(arr);
        }
    }

    public static void main(String[] args) {
        int[] myArr = {3,4,2,1};
        bubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }}