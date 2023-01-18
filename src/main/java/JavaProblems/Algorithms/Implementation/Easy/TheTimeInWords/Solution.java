package JavaProblems.Algorithms.Implementation.Easy.TheTimeInWords;

import java.io.*;

class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        // Write your code here
        // first solution doesn't submit all the test cases
//        String[] hours = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve"};
//        String[] minutes = {"", "One", "Two", " Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
//                "Eleven", "Twelve", "Thirteen", "Fourteen", "Quarter", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
//                "Twenty", "TwentyOne", "TwentyTwo", "TwentyThree",
//                "TwentyFour", "TwentyFive", "TwentySix", "TwentySeven", "TwentyEight", "TwentyNine", "Thirty"};
//
//        if (m == 0) {
//            return (hours[h] + " o' clock").toLowerCase();
//        } else if (1 <= m && m <= 30) {
//            if (m == 15) {
//                return (minutes[m] + " past " + hours[h]).toLowerCase();
//            }
//            return (minutes[m] + " minute past " + hours[h]).toLowerCase();
//        } else if (30 < m) {
//            if (m == 45) {
//                return (minutes[15] + " to " + hours[h + 1]).toLowerCase();
//            }
//            return (minutes[60 - m] + " minutes to " + hours[h + 1]).toLowerCase();
//        }
//        return "";

        // second solution hacker rank
        String[] hourArr = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine", "thirty", "thirty one", "thirty two", "thirty three", "thirty four",
                "thirty five", "thirty six", "thirty seven", "thirty eight", "thirty nine", "forty", "forty one",
                "forty two", "forty three", "forty four", "forty five", "forty six", "forty seven", "forty eight",
                "forty nine", "fifty", "fifty one", "fifty two", "fifty three", "fifty four", "fifty five", "fifty six",
                "fifty seven", "fifty eight", "fifty nine"};

        if (m == 0) {
            return hourArr[h] + " o' clock";
        } else if (m <= 30) {
            if (m == 15) {
                return "quarter past " + hourArr[h];
            } else if (m == 30) {
                return "half past " + hourArr[h];
            } else {
                if (h == 1) {
                    return hourArr[m] + " minute past " + hourArr[h];
                }
                return hourArr[m] + " minutes past " + hourArr[h];
            }
        } else {
            if (m == 45) {
                return "quarter to " + hourArr[h + 1];
            } else {
                return hourArr[60 - m] + " minutes to " + hourArr[h + 1];

            }
        }

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
