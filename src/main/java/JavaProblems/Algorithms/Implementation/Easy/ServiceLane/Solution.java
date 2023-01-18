package JavaProblems.Algorithms.Implementation.Easy.ServiceLane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * Complete the 'serviceLane' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY cases
 */


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] width = new int[n];
        int[][] cases = new int[t][2];

        for (int i = 0; i < n; i++) {
            width[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            cases[i][0] = sc.nextInt();
            cases[i][1] = sc.nextInt();
        }

        List<Integer> result = serviceLane(n, t, width, cases);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static List<Integer> serviceLane(int n, int t, int[] width, int[][] cases) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int f = cases[i][0];
            int l = cases[i][1];
            int min = Integer.MAX_VALUE;

            for (int j = f; j <= l; j++) {
                min = Math.min(min, width[j]);
            }
            result.add(min);
        }
        return result;
    }
}
