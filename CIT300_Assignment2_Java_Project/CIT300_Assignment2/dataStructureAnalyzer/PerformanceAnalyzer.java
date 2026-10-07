package dataStructureAnalyzer;

import java.util.Arrays;

public class PerformanceAnalyzer {
    public void compareLinearAndBinarySearch(int[] array, int target) {
        SearchingOperations searching = new SearchingOperations();

        long startLinear = System.nanoTime();
        int linearResult = searching.linearSearch(array, target);
        long endLinear = System.nanoTime();

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        long startBinary = System.nanoTime();
        int binaryResult = searching.binarySearch(sortedArray, target);
        long endBinary = System.nanoTime();

        System.out.println("\n========== PERFORMANCE ==========");
        System.out.println("Linear Search Result: " + linearResult);
        System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");
        System.out.println("Binary Search Result: " + binaryResult);
        System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");
        System.out.println("Linear Search Complexity: O(n)");
        System.out.println("Binary Search Complexity: O(log n)");
    }
}
