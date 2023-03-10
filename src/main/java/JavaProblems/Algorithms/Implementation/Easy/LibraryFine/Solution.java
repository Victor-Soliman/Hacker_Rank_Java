package JavaProblems.Algorithms.Implementation.Easy.LibraryFine;

import java.io.*;

class Result {

    /*
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */


    // Write your code here
//   if (y1 > y2) {
//                 return 10000;
//             } else if (y1 == y2 && m1 <= m2) {
//                 return 15 * (d1 - d2);
//             } else if (y1 <= y2) {
//                 return 500 * (m1 - m2);
//             } else {
//                 return 0;
//             }
    public static int libraryFine(int returnDay, int returnMonth, int returnYear, int dueDay, int dueMonth, int dueYear) {
        if (returnYear > dueYear) return 10000;
        else if (returnYear == dueYear) {
            if (returnMonth == dueMonth) {
                if (returnDay <= dueDay) return 0;
                else return (returnDay - dueDay) * 15;
            } else if (returnMonth < dueMonth) {
                return 0;
            } else {
                return (returnMonth - dueMonth) * 500;
            }
        } else { //returnYear < dueYear
            return 0;
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int d1 = Integer.parseInt(firstMultipleInput[0]);

            int m1 = Integer.parseInt(firstMultipleInput[1]);

            int y1 = Integer.parseInt(firstMultipleInput[2]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int d2 = Integer.parseInt(secondMultipleInput[0]);

            int m2 = Integer.parseInt(secondMultipleInput[1]);

            int y2 = Integer.parseInt(secondMultipleInput[2]);

            int result = Result.libraryFine(d1, m1, y1, d2, m2, y2);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}