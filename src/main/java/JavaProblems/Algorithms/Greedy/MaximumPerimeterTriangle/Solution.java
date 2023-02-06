package JavaProblems.Algorithms.Greedy.MaximumPerimeterTriangle;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here

        List<Integer> result = new ArrayList<>();
        sticks.sort(Comparator.naturalOrder());
        for (int i = sticks.size() - 1; i > 1; i--) {
            Integer sideA = sticks.get(i - 2);
            Integer sideB = sticks.get(i - 1);
            Integer sideC = sticks.get(i);
            if (sideA + sideB > sideC) {
                result.add(sideA);
                result.add(sideB);
                result.add(sideC);
                return result;
            }
        }
        result.add(-1);
        return result;



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.maximumPerimeterTriangle(sticks);

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
