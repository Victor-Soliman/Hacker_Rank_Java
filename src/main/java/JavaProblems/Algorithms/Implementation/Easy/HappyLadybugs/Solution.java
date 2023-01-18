package JavaProblems.Algorithms.Implementation.Easy.HappyLadybugs;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'happyLadybugs' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */

    private static final String YES = "YES";
    private static final String NO = "NO";
    private static final char UNDERSCORE = '_';
    private static final int NUMBER_OF_CHARACTERS = 26;
    private static final int INDEX_A = 65;

    public static String happyLadybugs(String board) {
        // Write your code here
        int numberOfEmptyCells = 0;
        int[] characterFrequencies = new int[numberOfEmptyCells];

        //Determine the frequencies
        for (char currentCharacter : board.toCharArray()) {
            if (currentCharacter == UNDERSCORE) {
                numberOfEmptyCells++;
            } else {// cell contains a ladybug
                int characterIndex = currentCharacter - INDEX_A;
                characterFrequencies[characterIndex]++;
            }
        }

        // if there is only a single colored ladybug ,there is no chance made all ladybug happy
        for (int frequency : characterFrequencies) {
            if (frequency == 1) {
                return NO;
            }
        }

        // if there board consists of ladybugs all of them are happy
        if (isAlreadyAllLadybugsHappy(board)) {
            return YES;
        }

        // if there is no chance to make all ladybugs happy
        if (numberOfEmptyCells == 0) {
            return NO;
        }
        return YES;


    }

    private static boolean isAlreadyAllLadybugsHappy(String board) {
        if (board.length() == 1) {
            return false;
        }
        for (int i = 1; i < board.length() - 1; i++) {
            if (board.charAt(i) != board.charAt(i - 1) && board.charAt(i) != board.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = Result.happyLadybugs(b);

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
