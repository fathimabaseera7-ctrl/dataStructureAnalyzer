```java
package dataStructureAnalyzer;

import java.util.Arrays;

public class SearchingOperations {

    // Linear Search: O(n)
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

    // Binary Search: O(log n); input must be sorted
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
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    // Compare search performance
    public void compareSearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            System.out.println(
                "Array is empty. Cannot perform search."
            );
            return;
        }

        long startLinear = System.nanoTime();
        int linearResult = linearSearch(array, target);
        long linearTime = System.nanoTime() - startLinear;

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        long startBinary = System.nanoTime();
        int binaryResult = binarySearch(sortedArray, target);
        long binaryTime = System.nanoTime() - startBinary;

        System.out.println("\n--- Linear Search ---");
        System.out.println(
            linearResult == -1
                ? "Value not found."
                : "Value found at original index: " + linearResult
        );
        System.out.println("Execution Time: " + linearTime + " ns");
        System.out.println("Time Complexity: O(n)");

        System.out.println("\n--- Binary Search ---");
        System.out.println(
            binaryResult == -1
                ? "Value not found."
                : "Value found at sorted array index: " + binaryResult
        );
        System.out.println("Execution Time: " + binaryTime + " ns");
        System.out.println("Time Complexity: O(log n)");

        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Linear Search: " + linearTime + " ns");
        System.out.println("Binary Search: " + binaryTime + " ns");
        System.out.println(
            "Binary Search requires sorted data."
        );
        System.out.println(
            "Execution times may vary between runs."
        );
    }
}
