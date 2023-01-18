package JavaProblems.Algorithms.Strings.BeautifulBinaryString;

import java.io.IOException;
/*
 * Complete the 'beautifulBinaryString' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING b as parameter.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        // first solution does not pass all the tests
        String b = "0100101010";
//        int n = b.length();
//        int count = 0;
//        String t = "010";
//
//        for (int i = 0; i < n - 3; i++) {
//            String substring = b.substring(i, i + 3);
//            if (substring.contains(t)) {
//                count++;
//            }
//        }
//        System.out.println(count);

        int stepsCount=0;
        String tmpStr=b;
        while(tmpStr.indexOf("010")!=-1){
            tmpStr=tmpStr.replaceFirst("010", "011");
            stepsCount++;
        }
        System.out.println(stepsCount);
    }
}
