package JavaProblems.Algorithms.WarmUp.PlusMinus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    // in this problem the solution passes the hacker rank tests ,but it gives exceptions on ide
    public static void plusMinus(List<Integer> arr) {
        float pozitiveNumbers = 0;
        float negativeNumbers = 0;
        float zeros = 0;

        for (int i = 0; i < arr.size() ; i++) {
            if (arr.get(i) > 0) {
                pozitiveNumbers++;
            }
            else if (arr.get(i) == 0) {
                zeros++;
            }
            else  {
                negativeNumbers++;
            }

        }
        System.out.printf("%f\n" , pozitiveNumbers / arr.size());
        System.out.printf("%f\n" , negativeNumbers / arr.size());
        System.out.printf("%f\n" , zeros / arr.size());
//
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
