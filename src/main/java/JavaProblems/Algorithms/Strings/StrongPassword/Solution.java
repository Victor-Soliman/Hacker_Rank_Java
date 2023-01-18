package JavaProblems.Algorithms.Strings.StrongPassword;

import java.io.*;

import static sun.swing.MenuItemLayoutHelper.max;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int num = 0;
        int lower = 0;
        int upper = 0;
        int special = 0;
        for (int i = 0; i < n; i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') num++;
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') upper++;
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') lower++;
            if (password.charAt(i) >= '!' && password.charAt(i) <= '+'
                    || password.charAt(i) == '-' || password.charAt(i) == '@')
                special++;
        }
        int count = 0;
        if (num == 0) count++;
        if (lower == 0) count++;
        if (upper == 0) count++;
        if (special == 0) count++;

        if (n <= 6) {
            return max(count, 6 - n);
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
