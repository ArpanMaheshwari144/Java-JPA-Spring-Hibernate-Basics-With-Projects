package arrays;

import java.util.Arrays;

public class CountingSort {

    public static void sort(int[] arr) {
        int arrayLength = arr.length;
        if (arrayLength == 0)
            return;
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arrayLength; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < arrayLength; i++)
            count[arr[i] - min]++;
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                arr[j++] = i + min;
    }
    public static void main(String[] args) {

        int[] testArray = { 10, 13, 9, 15, 7, 13,-9 };

        System.out.println("Elements before applying countingsort: " + Arrays.toString(testArray));

        sort(testArray);

        System.out.println("Elements after applying countingsort:  " + Arrays.toString(testArray));

    }
}
