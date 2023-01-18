//package JavaProblems.Algorithms.Strings.TwoCharacters;
//
//import java.io.*;
//import java.util.HashSet;
//import java.util.Set;
//
//class Result {
//
//    /*
//     * Complete the 'alternate' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts STRING s as parameter.
//     */
//
//    public static int alternate(String s) {
//        // Write your code here
//        int maxLength = 0;
//        Set<Character> set = new HashSet<>();
//        char[] chars = new char[set.size()];
//        for (int i = 0; i < s.length(); i++) {
//            set.add(s.charAt(i));
//
//            for (int j = 0; j < set.size(); j++) {
//
//                if (s.charAt(i) != set.)
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
//        int l = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String s = bufferedReader.readLine();
//
//        int result = Result.alternate(s);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
