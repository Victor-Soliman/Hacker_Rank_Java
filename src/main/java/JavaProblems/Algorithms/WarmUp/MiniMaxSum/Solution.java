package JavaProblems.Algorithms.WarmUp.MiniMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // first solution , can't submit hacker rank
//        arr.sort(Comparator.naturalOrder());
//        int min = 0;
//        int max = 0;
//        for (int i = 0, j = arr.size() -1 ; i < arr.size() - 1; i++, j--) {
//            min += arr.get(i);
//            max += arr.get(j);
//        }
//        System.out.println(min + " " + max);

        // second solution , good for hacker rank

        // length = 5
        // miniMinSum (4/5 elements) = [1,3,5,7]
        // miniMaxSum (4/5 elements) = [3,5,7,9]
        // min, max ,totalSum

        // arr = [1,3,5,7,9]
        int min = arr.get(0);
        int max = arr.get(0);
        long totalSum = 0;

        for (int n : arr) {
            totalSum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        //                         min                       max
        System.out.println((totalSum - max) + " " + (totalSum - min));
    }
    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
