package JavaProblems.Algorithms.Strings.MarsExploration;

import java.io.*;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here
        // first solution
//        int countError = 0;
//        for (int i = 3; i <= s.length(); i++) {
//            if (i % 3 == 0) {
//                if (s.charAt(i - 3) != 'S') {
//                    countError++;
//                }
//                if (s.charAt(i - 2) != 'O') {
//                    countError++;
//                }
//                if (s.charAt(i - 1) != 'S') {
//                    countError++;
//                }
//            }
//        }
//        return countError;

        // second solution
        int counter = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] != 'S') counter++;
            if (chars[i + 1] != 'O') counter++;
            if (chars[i + 2] != 'S') counter++;
            i = i + 2;
        }
        return counter;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
