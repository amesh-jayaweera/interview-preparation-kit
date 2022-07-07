package radix_sort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RadixSort {

    /**
     * Returns the maximum element from the given array
     * @param arr - integer array
     * @return - returns maximum positive integer
     */
    private static int findMaximumElement(int[] arr) {
        if (arr.length == 0)
            throw new RuntimeException("Array cannot be empty");
        int maxElement = arr[0];
        for(int e: arr) {
            if (e < 0)
                throw new RuntimeException("Array must only contains positive integers!");
            if (e > maxElement)
                maxElement = e;
        }
        return maxElement;
    }

    /**
     * Radix Sort - sorts given array using radix sort algorithm
     * @param arr - integer array
     */
    public static void sort(int[] arr) {
        // set initial exponent as 1, array size to variable `n`, and maximum value of given array to variable `max`
        int exponent = 1, n = arr.length, max = findMaximumElement(arr);

        // iterate until most significant digit from least significant digit
        while ((max / exponent) > 0) {
            // set 0-9 digit occurrences array
            int[] occurrences = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            // array which stored partially sorted values
            int[] sorted = new int[n];

            // count each digit occurrences
            for (int j : arr) {
                occurrences[(j / exponent) % 10] += 1;
            }

            // re-positioning the digit
            for (int i=1; i<10; i++) {
                occurrences[i] += occurrences[i-1];
            }

            //
            for(int i=n-1; i>0; i--) {
                sorted[occurrences[(arr[i] / exponent) % 10] - 1] = arr[i];
                occurrences[(arr[i] / exponent) % 10] -= 1;
            }

            System.arraycopy(sorted, 0, arr, 0, n);
            exponent = exponent * 10;
        }
    }

    public static void main(String[] args) {
        try {
            List<Integer> integerList = new ArrayList<>();
            File inputFile = new File("input.txt"), outputFile = new File("output.txt");
            Scanner inputReader = new Scanner(inputFile);
            while (inputReader.hasNextLine()) {
                try {
                    integerList.add(Integer.parseUnsignedInt(inputReader.nextLine().trim()));
                } catch (NumberFormatException e) {
                    // ignore invalid number format elements
                }
            }
            inputReader.close();

            if (integerList.isEmpty()) {
                System.out.println("Integer array is empty");
                return;
            }

            int arraySize = integerList.size();
            int[] arr = new int[arraySize];
            for (int i=0; i<arraySize; i++) {
                arr[i] = integerList.get(i);
            }

            // perform radix sort
            sort(arr);

            FileWriter outputWriter = new FileWriter(outputFile);
            for (int e: arr) {
                outputWriter.write(e + "\n");
            }
            outputWriter.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } finally {
            System.out.println("Performed Radix Sorting ***");
        }
    }
}
