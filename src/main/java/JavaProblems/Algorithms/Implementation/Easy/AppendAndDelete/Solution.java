package JavaProblems.Algorithms.Implementation.Easy.AppendAndDelete;

import java.io.*;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        // solution 1 : does not work for all cases hacker rank
//        int position = 0;
//        int counter = 0;
//        // iterate on both strings and find the last position with the same char
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j <= i; j++) {
//                if (s.charAt(i) != s.charAt(j)) {
//                    position = s.charAt(i);
//                    break;
//                }
//            }
//        }
//        // convert strings to StringBuilder
//        StringBuilder stringBuilderS = new StringBuilder(s);
//        StringBuilder stringBuilderT = new StringBuilder(t);
//
//        String neededToChange1 = stringBuilderS.substring(position + 1, stringBuilderS.length() - 1);
//        String neededToChange2 = stringBuilderT.substring(position + 1, stringBuilderS.length() - 1);
//
//        // delete each character started form the last in the first string
//        for (int i = s.length() - 1; i >= position; i--) {
//            stringBuilderS.deleteCharAt(i);
//            counter++;
//        }
//        // append the letters from the second string to the first one started
//        // with the one in position +1
//        for (int i = position + 1; i <= s.length(); i++) {
//
//            if (stringBuilderT.charAt(position + 1) == 0) {
//                return "No";
//            } else {
//                for (int j = position + 1; j <= t.length(); j++) {
//                    stringBuilderS.append(j);
//                    counter++;
//                }
//            }
//        }
//        if (counter <= k) return "Yes";
//        else return "No";

        // solution 2 : work for hacker rank
        //if k is bigger than both strings combined, return Yes
        //since you can just delete the entire first string
        //and add the entire second string
        if (s.length() + t.length() <= k) {
            return "Yes";
        }
        //ints to represent the length of the larger string
        //and the length of the smaller string
        int stringSmaller = Math.min(s.length(), t.length());
        int stringLarger = Math.max(s.length(), t.length());
        //We're gonna calculate how many chars at the start
        //of each string are the same
        int sameString = 0;
        for (int i = stringSmaller; i >= 0; i--) {
            String substringS = s.substring(0, i);
            String substringT = t.substring(0, i);
            if (substringS.equals(substringT)) {
                sameString = i;
                break;
            }
        }
        //now we calculate the "rest" of each string's length
        //(that parts that are NOT the same on each string)
        int restOfStringBig = stringLarger - sameString;
        int restOfStringSmall = stringSmaller - sameString;
        //if k isn't large enough to delete/append enough
        //letters, return No
        if (restOfStringBig + restOfStringSmall > k) {
            return "No";
            //else, if k is either equal to the total "different" letters,
            //OR if k is 2 more than the total, or 4 more, or 6 more, etc
            //then you can just repeatedly delete and append the same
            //letter, so return Yes
        } else if ((k - (restOfStringBig + restOfStringSmall)) % 2 == 0) {
            return "Yes";
            //if the above isn't satisfied, then there will always be
            //one "different" letter left over. Return No.
        } else {
            return "No";
        }


    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
