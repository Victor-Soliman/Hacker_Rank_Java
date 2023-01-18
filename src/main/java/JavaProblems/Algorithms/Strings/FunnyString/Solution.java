package JavaProblems.Algorithms.Strings.FunnyString;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
 * Complete the 'funnyString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */


public class Solution {
    public static void main(String[] args) throws IOException {
        String s = "acxz";
        StringBuilder builder = new StringBuilder();

        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
//        System.out.print(s + "\n");
//        System.out.print(builder);
        char[] reverseChars = builder.toString().toCharArray();

        // create empty arrays to add Aschii value
        List<Integer> sValues = new ArrayList<>();
        List<Integer> reverseValues = new ArrayList<>();

        // add ascii value to the first array
        for (int i = 0; i < chars.length; i++) { // they have the same length
            sValues.add(i);
            reverseValues.add(i);
        }
        // create & add distance array for first charArray
        List<Integer> distance1 = new ArrayList<>();
        List<Integer> distance2 = new ArrayList<>();

        for (int j = 0; j < chars.length - 1; j++) { // they have the same length
            distance1.add(Math.abs(chars[j] - chars[j + 1]));
            distance2.add(Math.abs(reverseChars[j] - reverseChars[j + 1]));
        }


        if (distance1.equals(distance2)) {
            System.out.println("Funny");
        } else
            System.out.println("Not Funny");
    }
}
