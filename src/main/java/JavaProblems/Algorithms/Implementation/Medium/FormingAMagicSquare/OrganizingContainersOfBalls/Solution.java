package JavaProblems.Algorithms.Implementation.Medium.FormingAMagicSquare.OrganizingContainersOfBalls;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here
//        Integer firstA = 0;
//        Integer secondA = 0;
//        Integer firstB = 0;
//        Integer secondB = 0;
//
//        for (int i = 0; i < container.size(); i++) {
//            for (int j = 0; j <= i; j++) {
//                if (i % 2 == 0) {
//                    firstA = container.get(i).get(j);
//                    firstA = firstA + 1;
//
//                    secondA = container.get(i).get(j + 1);
//                    secondA = secondA - 1;
//
//                } else if (i % 2 != 0) {
//                    firstB = container.get(i).get(j);
//                    firstB = firstB - 1;
//
//                    secondB = container.get(i).get(j + 1);
//                    secondB = secondB + 1;
//                }
//            }
//        }
//
//        if (firstA == secondB && secondA == firstB) {
//            return "Possible";
//        } else return "Impossible";
        int n = container.size();
        int[] balls = new int[n];
        int[] capacity = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                balls[i] += container.get(j).get(i);
                capacity[i] += container.get(i).get(j);
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer ^= balls[i];
            answer ^= capacity[i];
        }
        return answer == 0 ? "Possible" : "Impossible";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> container = new ArrayList<>();

                IntStream.range(0, n).forEach(i -> {
                    try {
                        container.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                String result = Result.organizingContainers(container);

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
