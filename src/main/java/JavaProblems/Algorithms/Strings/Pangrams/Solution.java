package JavaProblems.Algorithms.Strings.Pangrams;

import java.io.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        // https://www.youtube.com/watch?v=swSA4kvK5JU

        boolean[] mark = new boolean[26];
        int index = 0;
        String pangram = "pangram";

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current >= 'A' && current <= 'Z') {
                index = current - 'A';
            } else if (current >= 'a' && current <= 'z') {
                index = current - 'a';
            }
            mark[index] = true;
        }

        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == false) return "not pangram";
        }
        return pangram;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
