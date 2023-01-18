package JavaProblems.Algorithms.Implementation.Easy.DrawingBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        // Write your code here
        List<Integer> book = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            book.add(i);
        }

        int counter = 0;
        for (int i = 1, j = n; i <= n && j >= 1; i = i + 2, j = j - 2) {
            if (book.get(i) == p || book.get(i - 1) == p || book.get(j) == p || book.get(j + 1) == p) {
                counter++;
            }
        }
        return counter;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
