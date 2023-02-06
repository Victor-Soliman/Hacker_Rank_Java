package JavaProblems.Algorithms.Greedy.MinimumAbsoluteDifferenceInAnArray;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        // first solution , doesn't pass all the tests on hackerrank

//        int minimum = Integer.MAX_VALUE;

//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i + 1; j <= arr.size() - 1; j++) {
//                int abs = Math.abs(arr.get(i) - arr.get(j));
//                if (abs < minimum) {
//                    minimum = abs;
//                }
//            }
//        }
////        return minimum;

        // second solution
        Collections.sort(arr);

        int min = Math.abs(arr.get(0) - arr.get(1));

        for(int i = 0; i < arr.size() - 1; i++) {


            int diff = Math.abs(arr.get(i) - arr.get(i + 1));

            if(diff == 0) {
                return diff;
            }

            if(diff < min) {
                min = diff;
            }
        }

        return min;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
