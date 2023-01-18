package JavaProblems.Algorithms.Implementation.Easy.CountingValleys;

import java.io.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        // here we actually we count the mountain not the valley
        char up = 'U';
        char down = 'D';
        int sea = 0;
        int mountain = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == up) sea = sea + 1;
            else if (path.charAt(i) == down) sea = sea - 1;
            if (sea == 0 && path.charAt(i) == up) mountain++;
        }
        return mountain;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
