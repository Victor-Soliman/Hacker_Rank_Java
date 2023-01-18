package JavaProblems.Algorithms.Implementation.Easy.CutTheSticks;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */


    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        while (list.size() != 0) {
            sizes.add(list.size());
            Integer min = Collections.min(list);
            list.removeAll(Collections.singleton(min));
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) - min);
            }
        }
        return sizes;
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

        List<Integer> result = Result.cutTheSticks(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
