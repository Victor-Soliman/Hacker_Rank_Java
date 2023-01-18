package JavaProblems.Algorithms.Strings.HackerRankInAString;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        // Write your code here
//        String str = "hackerrank";
//        int j = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (j == str.length() - 1) {
//                return "YES";
//            }
//            if (s.charAt(i) == str.charAt(j)) {
//                j++;
//            }
//        }
//        return "NO";

        String base = "hackerrank";
        int b = 0; //for accessing the base string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == base.charAt(b))
                b++;
            if (b == base.length()) //if reached the end of base str-
                return "YES";
        }
        return "NO";
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

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
