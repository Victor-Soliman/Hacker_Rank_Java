package JavaProblems.Algorithms.Greedy.BeautifulPairs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'beautifulPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY A
     *  2. INTEGER_ARRAY B
     */

    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        // Write your code here
        // first solution ,doesn't pass all hacker rank tests
//        int numberInBothArrays = 0;
//        int numberInBothArrays2 = 0;
//
//        for (int i = 0; i < A.size(); i++) {
//            Integer numberToCheck = B.get(i);
//            if (A.contains(numberToCheck)) {
//                numberInBothArrays++;
//            }
//        }
//
//        for (int i = 0; i < B.size(); i++) {
//            Integer numberToCheck = A.get(i);
//            if (B.contains(numberToCheck)) {
//                numberInBothArrays2++;
//            }
//        }
//
//        if (numberInBothArrays > numberInBothArrays2) {
//            return numberInBothArrays;
//        } else {
//            return numberInBothArrays2 + 1;
//        }
        // second solution hacker rank
        int max = 0;
        // we create a list that has the same elements as A
        List<Integer> temp = new ArrayList<>(A);

        for (Integer item : temp) {
            if (A.contains(item) && B.contains(item)) {
                max++;
                A.remove(item);
                B.remove(item);
            }
        }

        if (A.size() >= 1 && B.size() >= 1) {
            max++;
        }
        else if (max == temp.size()) {
            //this is only used when every pair has a match
            //and you have to change one pair
            // "Your task is to change exactly 1 element"
            max--;
        }
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.beautifulPairs(A, B);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
