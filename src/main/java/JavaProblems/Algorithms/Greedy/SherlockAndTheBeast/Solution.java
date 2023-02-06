package JavaProblems.Algorithms.Greedy.SherlockAndTheBeast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'decentNumber' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void decentNumber(int n) {
        // Write your code here
//        int numOfFives = n;
//        while (numOfFives % 3 != 0) {
//            numOfFives = numOfFives - 5;
//        }
//        if (numOfFives < 0) {
//            System.out.println("-1");
//        } else {
//            System.out.println("5".repeat(numOfFives) + "3".repeat(n - numOfFives));
//        }

        StringBuilder sb = new StringBuilder();

        int m = n;
        while (m % 3 != 0) {
            m -= 5;
        }

        if (m < 0) sb = sb.append(-1);

        else {
            for (int i = 0; i < m; i++) {
                sb.append(5);
            }

            for (int i = 0; i < n - m; i++) {
                sb.append(3);
            }
        }

        System.out.println(sb);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                Result.decentNumber(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
