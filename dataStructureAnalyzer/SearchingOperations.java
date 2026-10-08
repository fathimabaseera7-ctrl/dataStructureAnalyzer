package dataStructureAnalyzer;

import java.util.Arrays;

public class SearchingOperations {
    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == target) return middle;
            if (array[middle] < target) left = middle + 1;
            else right = middle - 1;
        }
        return -1; 
public int binarySearch(int[] array, int target) {
    if (array == null || array.length == 0) {
        return -1;
    }

    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
        int middle = left + (right - left) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (array[middle] < target) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
    }

    return -1;
}
    }

    public void compareSearch(int[] array, int target) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        long startLinear = System.nanoTime();
        int linearResult = linearSearch(array, target);
        long endLinear = System.nanoTime();

        long startBinary = System.nanoTime();
        int binaryResult = binarySearch(sortedArray, target);
        long endBinary = System.nanoTime();

        System.out.println("\n--- Linear Search ---");
        System.out.println(linearResult == -1 ? "Value not found." :
                "Value found at index: " + linearResult);
        System.out.println("Execution Time: " + (endLinear - startLinear) + " ns");

        System.out.println("\n--- Binary Search ---");
        System.out.println(binaryResult == -1 ? "Value not found." :
                "Value found in sorted array at index: " + binaryResult);
        System.out.println("Execution Time: " + (endBinary - startBinary) + " ns");
    }
}





public int linearSearch(int[] array, int target) {
    if (array == null || array.length == 0) {
        return -1;
    }

    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i;
        }
    }

    return -1;
}
