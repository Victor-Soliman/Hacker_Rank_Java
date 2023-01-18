package JavaProblems.Algorithms.Implementation.Easy.SherlockAndSquares;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
        // Write your code here
        // first solution : didn't submit all the test cases'
//        int counter = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (a <= Math.pow(i, 2) && Math.pow(i, 2) <= b){
//                counter ++;
//            }
//        }return counter;

        // second solution , works for hacker rank
        double sqrtA = Math.floor(Math.sqrt(a));
        double sqrtB = Math.floor(Math.sqrt(b));
        if (sqrtA * sqrtA == a) {
            return (int) (sqrtB - sqrtA + 1);
        } else {
            return (int) (sqrtB - sqrtA);
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int a = Integer.parseInt(firstMultipleInput[0]);

                int b = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.squares(a, b);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
