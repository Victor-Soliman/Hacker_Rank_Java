package JavaProblems.Algorithms.BitManipulation.LonelyInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            a.add(input.nextInt());
        }

        // first solution ,didn't pass all hackerrank tests
//        int lonley = 0;
//        if (a.size() == 1) {
//            System.out.println(a.get(0));
//            System.exit(0);
//        }
//        Collections.sort(a);
//        for (int i = 0; i < a.size() - 1; i++) {
//            if (!a.get(i).equals(a.get(i + 1))) {
//                lonley = a.get(i);
//            }
//        }
//        System.out.println(lonley);

        // second solution
        // https://www.youtube.com/watch?v=k1i6eIpeXak
        int lonley = 0;
        for (int i = 0; i < a.size(); i++) {
//            lonley = lonley^a.get(i);
            lonley ^= a.get(i);
        }
        System.out.println(lonley);
    }
}
