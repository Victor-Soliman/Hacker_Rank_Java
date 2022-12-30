package JavaProblems.Intervirew;

import java.io.*;


class Result {

    /*
     * Complete the 'entryTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING keypad
     */

    public static int entryTime(String s, String keypad) {
        int[][] matrix = new int[3][3];

        for (int i = 1; i <= matrix.length - 1; i++) {
            for (int j = 1; j <= matrix.length - 1; j++) {
                matrix[i][j] = keypad.charAt(i);
            }
        }

        int counter = 0;
        int distance = 0;


        for (int i = 1; i <= matrix.length - 1; i++) {
            for (int j = 1; j <= matrix.length - 1; j++) {
                if (keypad.charAt(i) == i){
                    distance  = 1;
                    counter ++;
                }
            }
        }

        return 0;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String keypad = bufferedReader.readLine();

        int result = Result.entryTime(s, keypad);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}