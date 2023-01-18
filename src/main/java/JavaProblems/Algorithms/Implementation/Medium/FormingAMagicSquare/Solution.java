package JavaProblems.Algorithms.Implementation.Medium.FormingAMagicSquare;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
        // Write your code here
        //     https://www.youtube.com/watch?v=FMxA_g9oQnA
        // 3 steps to solve this problem
        // 1. the sum of every diagonal ,column , row is equal to 15
        // 2. 8 ways to sum up to 15 :
        // 1 + 9 + 5
        // 2 + 8 + 5
        // 3 + 7 + 5
        // 4 + 6 + 5
        // 4 + 3 + 8
        // 6 + 2 + 7
        // 6 + 1 + 8
        // 9 + 2 + 4
        // 3. the center is always 5 , edges have to be 1,3,7,9 , corners have to be 2,4,6,8

        // all the possible matrix's
        int[][] magic = new int[][]{{8, 1, 6, 3, 5, 7, 4, 9, 2},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {8, 3, 4, 1, 5, 9, 6, 7, 2},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {2, 7, 6, 9, 5, 1, 4, 3, 8}};

        int[] input = new int[9];
        int minCost = Integer.MAX_VALUE;
        int diff = 0;
        int inputIndex = 0;
        //convert 2D Array List s into a 1D array
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.get(i).size(); j++) {
                input[inputIndex] = s.get(i).get(j);
                inputIndex++;
            }
        }
        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic[i].length; j++) {
                diff += Math.abs((magic[i][j] - input[j]));
            }
            if (diff < minCost) {
                minCost = diff;
            }
            diff = 0;   //reset back to 0 to test the next row
        }
        return minCost;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
