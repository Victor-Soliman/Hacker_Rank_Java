package JavaProblems.Algorithms.BitManipulation.SumvsXOR;

import java.io.*;

class Result {

    /*
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
        // Write your code here

        // first solution , doesn't pass all the tests on
        // Hackerrank for big numbers ,O(N)
//        int count = 0;
//        if (n == 0) return 1;
//        for (long i = 0; i < n; i++) {
//            if ((n + i) == (n ^ i)) {
//                count++;
//            }
//        }
//        return count;

        // solution 2
        int count = 0;
        for (char ch : Long.toBinaryString(n).toCharArray()) {
            count += (ch == '0') ? 1 : 0;
        }
        return (n != 0) ? (long) Math.pow(2, count) : 1;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.sumXor(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
