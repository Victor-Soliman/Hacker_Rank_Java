package JavaProblems.Algorithms.SolveMeFirst;

import java.util.*;


public class Solution {


    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(solveMeFirst(a, b));
    }
}
