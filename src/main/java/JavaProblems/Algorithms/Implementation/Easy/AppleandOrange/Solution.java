package JavaProblems.Algorithms.Implementation.Easy.AppleandOrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        List<Integer> applesRange = new ArrayList<>();
        List<Integer> orangesRange = new ArrayList<>();
        int appleNumber = 0;
        int orangeNumber = 0;

        for (int i = 0; i < apples.size(); i++) {
            int aRange = apples.get(i) + a;
            applesRange.add(aRange);
        }
        for (int j = 0; j < oranges.size(); j++) {
            int oRange = oranges.get(j) + b;
            orangesRange.add(oRange);
        }

        for (int k = 0; k < applesRange.size(); k++) {
            if (s <= applesRange.get(k) && applesRange.get(k) <= t) appleNumber++;
        }
        for (int l = 0; l < orangesRange.size(); l++) {
            if (s <= orangesRange.get(l) && orangesRange.get(l) <= t) orangeNumber++;
        }

        System.out.println(appleNumber);
        System.out.println(orangeNumber);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
