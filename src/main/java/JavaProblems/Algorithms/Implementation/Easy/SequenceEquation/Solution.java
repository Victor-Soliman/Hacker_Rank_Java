package JavaProblems.Algorithms.Implementation.Easy.SequenceEquation;

import java.io.IOException;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (index == array[j])
                    index = j + 1;
            }

            for (int j = 0; j < n; j++) {
                if (index == array[j])
                    System.out.println(j + 1);
            }
        }
    }
}