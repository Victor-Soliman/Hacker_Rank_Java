package JavaProblems.Algorithms.sorting.easy.BigSorting.Quicksort1Partition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Complete the 'quickSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }
        System.out.println(quickSort(list));
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        // first solution don't pass all the tests, but the method should return void
//        int pivot = arr.get(0);
//
//        List<Integer> left = new ArrayList<>();
//        List<Integer> right = new ArrayList<>();
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) < pivot) {
//                left.add(arr.get(i));
//            }
//            if (arr.get(i) > pivot) {
//                right.add(arr.get(i));
//            }
//        }
//
//        List<Integer> all = new ArrayList<>();
//        for (int i = 0; i < left.size(); i++) {
//            all.add(left.get(i));
//        }
//        all.add(pivot);
//        for (int i = 0; i < left.size(); i++) {
//            all.add(right.get(i));
//        }
//
//        for (Integer temp : all) {
//            System.out.print(temp + " ");
//        }

        // second solution
        Integer pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            Integer element = arr.get(i);
            if (element < pivot) {
                left.add(element);
            } else if (element > pivot) {
                right.add(element);
            } else {
                equal.add(element);
            }
        }
        left.addAll(equal);
        left.addAll(right);

        return left;
    }
}
