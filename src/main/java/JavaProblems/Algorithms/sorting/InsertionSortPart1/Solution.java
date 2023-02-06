package JavaProblems.Algorithms.sorting.InsertionSortPart1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Complete the 'insertionSort1' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY arr
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(input.nextInt());
        }
        insertionSort(array);
        input.close();
    }

    public static void insertionSort(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        Integer elementNeededToBeInserted = arr.get(size - 1);

        for (int i = size - 2; i >= 0; i--) {
            if (arr.get(i) > elementNeededToBeInserted) {
                arr.set(i + 1, arr.get(i));
                printArray(arr);
            } else {
                arr.set(i + 1, elementNeededToBeInserted);
                printArray(arr);
                break;
            }
            if (i == 0 && (arr.get(i) > elementNeededToBeInserted)) {
                arr.set(i, elementNeededToBeInserted);
                printArray(arr);

            }
        }
    }

    public static void printArray(List<Integer> array) {
        for (Integer number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
