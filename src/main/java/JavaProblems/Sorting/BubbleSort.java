package JavaProblems.Sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] a = {5, 3, 7, 1, 5, 9, 3, 1, 4, 7};
//        int n = a.length;
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(3);
        a.add(7);
        a.add(1);
        a.add(5);
        a.add(9);
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(7);
        int n = a.size();
        int count = 0;

//        System.out.println(" Before Sort : " + Arrays.toString(a));
        System.out.println(" Before Sort : " + a);

//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n - 1; j++) {
//                // Swap adjacent elements if they are in decreasing order
//                if (a[j] > a[j + 1]) {
//
////                    swap(a[j], a[j + 1]);
//                    swap(a, j);
//                    count ++;
//                }
//            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {

//                    swap(a[j], a[j + 1]);
                    swap(a.get(j), a.get(j + 1));
                    count++;
                }
            }


        }
        System.out.println("Array is sorted in numSwaps swaps : " + count);
        System.out.println(" After Sort : " + a);
        System.out.println("First Element : " + a.get(0));
        System.out.println("Last Element : " + a.get(a.size() - 1));

    }

    private static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

}
