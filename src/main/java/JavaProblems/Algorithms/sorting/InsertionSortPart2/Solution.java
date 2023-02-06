package JavaProblems.Algorithms.sorting.InsertionSortPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void insertionSortPart2(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {

            for (int j = i; j > 0; j--) {
                if (arr.get(j) < arr.get(j - 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                } else {
                    break;
                }
            }
            printArray(arr);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(input.nextInt());
        }
        insertionSortPart2(array);
        input.close();
    }

    private static void printArray(List<Integer> array) {
        for (Integer number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
