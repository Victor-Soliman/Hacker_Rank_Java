package JavaProblems.Algorithms.BitManipulation.MaximizingXOR;

import java.io.*;

class Result {

    /*
     * Complete the 'maximizingXor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */


    static int maximizingXor(int l, int r) {
//        int max = 0;
//        for (Integer num : numbersXOR(l, r)) {
//            max = Math.max(max, num);
//        }
//        return max;
        int max = 0;
        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {
                int xor = i ^ j;
                if (xor > max) {
                    max = xor;
                }
            }
        }
        return max;
    }
//
//    static List<Integer> numbersXOR(int l, int r) {
//        List<Integer> valuesNumbers = new ArrayList<>();
//        int count = l;
//        while (count <= r) {
//            for (int i = l; i <= r; i++) {
//                valuesNumbers.add(count ^ i);
//            }
//            count++;
//        }
//        return valuesNumbers;
//    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.maximizingXor(l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
