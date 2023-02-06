//package JavaProblems.Algorithms.Greedy.LargestPermutation;
//
//import java.io.*;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Stream;
//
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'largestPermutation' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. INTEGER k
//     *  2. INTEGER_ARRAY arr
//     */
//
//    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
//        // Write your code here
//
////        Integer max = Integer.MAX_VALUE;
////        Integer first = arr.get(0);
////        for (int i = 0; i < arr.size(); i++) {
////            if (arr.get(i) > max) {
////                max = arr.get(i);
////                Collections.swap(arr, first, max);
////            }
////        }
////        return arr;
//
//        Map<Integer, Integer> index = new HashMap<>();
//        for (int i = 0; i < arr.size(); i++) {
//            index.put(arr.get(i), i);
//        }
//
//        int swaps = 0;
//        int i = 0;
//
//        while (swaps < k && i < arr.size()) {
//            if (arr.get(i) < arr.size() - i) {
//                // swap operation of elements
//                int idx = index.get(arr.size() - i);
//                Collections.swap(arr, arr.get(i), arr.get(idx));
//                // update index of map
//                index.put(arr.get(idx)) = idx;
//            }
//        }
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int k = Integer.parseInt(firstMultipleInput[1]);
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = Result.largestPermutation(k, arr);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
