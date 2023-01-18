package JavaProblems.Algorithms.Implementation.Easy.EqualizeTheArray;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int count = 0;
        int maxCount = 0;
        //Go through each value in the array list
        //Check it against every value after it
        //If they're equal, increment the count
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
                //if the count beats the current maxCount,
                //make that the new maxCount
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            count = 0;
        }
//Since the maxCount doesn't include the value itself,
//The actual count of matching values is 1 more than maxCount
//So subtract 1 from the return statement to make up for it
        return arr.size() - maxCount - 1;

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

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
