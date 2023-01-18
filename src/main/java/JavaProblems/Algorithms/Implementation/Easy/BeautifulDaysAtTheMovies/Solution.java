package JavaProblems.Algorithms.Implementation.Easy.BeautifulDaysAtTheMovies;

import java.io.*;

class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int beautifulDay = 0;
        for (int firstNumber = i; firstNumber <= j; firstNumber++) {
            if (Math.abs(firstNumber - reverseNumber(firstNumber)) % k == 0) {
                beautifulDay++;
            }
        }
        return beautifulDay;
    }

    // a method to reverse a number mathematically
    public static int reverseNumber(int number) {
        int result = 0;
        while (number > 0) {
            result = result * 10 + (number % 10);
            number /= 10;
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
