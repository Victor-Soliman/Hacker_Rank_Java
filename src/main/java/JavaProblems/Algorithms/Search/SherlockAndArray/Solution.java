package JavaProblems.Algorithms.Search.SherlockAndArray;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        // Write your code here

        // first solution O(N2)
//        int n = arr.size();
//
//        int sumFor[] = new int[n];
//        int sumBack[] = new int[n];
//
//        sumFor[0] = arr.get(0);
//        sumBack[n - 1] = arr.get(n - 1);
//
//        for (int i = 1; i < n; i++) {
//            sumFor[i] = arr.get(i) + sumFor[i - 1];
//        }
//        for (int i = n - 2; i >= 0; i--) {
//            sumBack[i] = arr.get(i) + sumBack[i + 1];
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (sumFor[i] == sumBack[i]) {
//                return "YES";
//            }
//        }
//        return "NO";

        // second solution O(N)
        int size = arr.size();
        int totalSum = 0;
        for (Integer number : arr) {
            totalSum += number;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (leftSum == totalSum - arr.get(i) - leftSum) {
                return "YES";
            } else {
                leftSum += arr.get(i);
            }

        }
        return "NO";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = Result.balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
