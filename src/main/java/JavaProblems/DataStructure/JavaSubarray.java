package JavaProblems.DataStructure;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        // first solution
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] array = new int[n];
//        int negative_subarray = 0;
//
//        for (int i = 0; i < n; i++) {
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("**********");
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int current_sum = 0;
//                for (int k = i; k <= j; k++) {
//                    current_sum += array[k];
//                }
//                if (current_sum < 0) {
//                    negative_subarray++;
//                }
//            }
//        }
//        System.out.println(negative_subarray);
//        System.out.println("**********");

        // second solution
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println(count);
    }
}
