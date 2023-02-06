package JavaProblems.Algorithms.sorting.easy.BigSorting.InsertionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorting {

    public static List<Integer> insertionSort(List<Integer> array) {
        // we go from the second position in te array till the end
        for (int i = 1; i < array.size(); i++) {
            // on each position ,we check with the element before it (from the left)
            // to check if it is greater than the element in our position
            int j = i;
            while (j > 0 && (array.get(j - 1) > array.get(j))) {
                // then we swap the  2 elements
                int temp = array.get(j);
                array.set(j, array.get(j - 1));
                array.set(j - 1, temp);
                j--;
            }
        }
        System.out.println(array);
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(input.nextInt());
        }
        insertionSort(array);
        input.close();
    }
}
