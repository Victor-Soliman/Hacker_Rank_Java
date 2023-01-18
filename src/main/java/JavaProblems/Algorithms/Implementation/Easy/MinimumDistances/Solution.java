package JavaProblems.Algorithms.Implementation.Easy.MinimumDistances;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
        // Write your code here

        // first solution :does not pass all the tests on hacker rank
//        List<Integer> minimums = new ArrayList<>();
//        int minArray = -1;
//
//        for (int i = 0; i < a.size(); i++) {
//            for (int j = i + 1; j < a.size(); j++) {
//                if (a.get(i) == a.get(j)) {
//                    int min = j - i;
//
//                    minimums.add(min);
//                    minArray = minimums.get(0);
//                    for (int k = 0; k < minimums.size(); k++) {
//                        if (minimums.get(k) < minArray) {
//                            minArray = minimums.get(k);
//                        }
//                    }
//                }
//            }
//        }
//        return minArray;

        // second solution does not pass all the tests
//        List<Integer> minimums = new ArrayList<>();
//        int minArray = -1;
//
//        for (int i = 0; i < a.size(); i++) {
//            for (int j = i + 1; j < a.size(); j++) {
//                if (a.get(i) == a.get(j)) {
//                    minArray = j - i;
//                }
//            }
//        }
//        return minArray;

        // third solution
        // declare a minimum distance
        int minDistance = Integer.MAX_VALUE;
        // declare a map
        Map<Integer, Integer> map = new HashMap<>();

        // iterate the list and add the values to the map if they dont exist
        // if exists ,check the distance
        for (int i = 0; i < a.size(); i++) {

            Integer keyListValue = a.get(i);

            if (map.containsKey(keyListValue)) {
                // the distance is the subtraction
                int distance = Math.abs(i - map.get(keyListValue));
                if (distance < minDistance) {
                    minDistance = distance;
                }
            } else {
                map.put(keyListValue, i);
            }
        }
        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        } else return minDistance;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
