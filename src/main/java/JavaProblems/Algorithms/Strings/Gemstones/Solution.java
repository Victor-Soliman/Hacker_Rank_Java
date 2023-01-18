package JavaProblems.Algorithms.Strings.Gemstones;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
        // Write your code here
        Set<Character> searchedChar = new HashSet<>();
        int jemCount = 0;

        for(int i=0; i< arr.size(); i++) {
            String str = arr.get(i);
            for(char ch : str.toCharArray()) {
                if(!searchedChar.contains(ch)) {
                    searchedChar.add(ch);
                    int charCount = 0;
                    for(int j=0; j<arr.size(); j++) {
                        if(i ==j) continue;
                        if(arr.get(j).contains(ch+"")){
                            charCount++;
                        }
                    }
                    if(charCount == (arr.size() -1)) {
                        jemCount++;
                    }
                }
            }
        }

        return jemCount;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
