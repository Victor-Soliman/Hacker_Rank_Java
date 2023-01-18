package JavaProblems.Algorithms.Implementation.Easy.MigratoryBirds;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        // first standing solution hacker rank
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//                int n = in.nextInt();
//                int[] types = new int[n];
//                int maxFreqValue = 0, freqId = 0;
//                for (int types_i = 0; types_i < n; types_i++) {
//                    int index = in.nextInt();
//                    types[index - 1]++;
//                }
//
//                for (int i = 0; i < n; i++) {
//                    if (types[i] > maxFreqValue) {
//                        maxFreqValue = types[i];
//                        freqId = i + 1;
//                    }
//                }
//                System.out.println(freqId);
//                in.close();
//            }

            // second solution
        int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0;
        List<Integer> arrs = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                t1++;
            }
            if (arr.get(i) == 2) {
                t2++;
            }
            if (arr.get(i) == 3) {
                t3++;
            }
            if (arr.get(i) == 4) {
                t4++;
            }
            if (arr.get(i) == 5) {
                t5++;
            }
        }
        arrs.add(t1);
        arrs.add(t2);
        arrs.add(t3);
        arrs.add(t4);
        arrs.add(t5);

        int max = arrs.get(0);
        for (int i = 1; i < arrs.size(); i++) {
            if (arrs.get(i) > max) {
                max = arrs.get(i);
            }
        }

        for (int i = 0; i < arrs.size(); i++) {
            if (max == arrs.get(i)) {
                return i + 1;
            }
        }
        return 0;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
