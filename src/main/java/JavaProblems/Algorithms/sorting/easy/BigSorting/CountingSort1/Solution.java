package JavaProblems.Algorithms.sorting.easy.BigSorting.CountingSort1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        // first solution
//        int[] frequency = new int[100];
//
//        for(int i = 0; i < arr.size(); i++) {
//            frequency[arr.get(i)] = ++frequency[arr.get(i)];
//        }
//
//        List<Integer> answer = Arrays.stream(frequency)
//                .boxed()
//                .collect(Collectors.toList());
//
//        return answer;

        // second solution
        int[] frequencies = new int[100];
        Arrays.fill(frequencies, 0);
        for (Integer a : arr) {
            frequencies[a]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            result.add(frequencies[i]);
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
