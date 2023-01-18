package JavaProblems.Algorithms.WarmUp.TimeConversion;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        // you split the string in 3 parts first
        String[] splited = s.split(":");
        // first part:hours
        Integer hours = Integer.parseInt(splited[0]);
        // second part: min
        Integer min = Integer.parseInt(splited[1]);
        // third part : seconds and ampm
        String secAMPM = splited[splited.length - 1];
        // you need a way to split it , so you use substring , to get seconds
        Integer seconds = Integer.parseInt(secAMPM.substring(0, secAMPM.length() / 2));
        // get ampm
        String amPm = secAMPM.substring(secAMPM.length() / 2, secAMPM.length());


        String military = "";
        // check if it is PM
        if (amPm.compareTo("PM") == 0) {
            if (hours < 12)
                military = String.format("%02d:%02d:%02d", (hours + 12), min, seconds);
            if (hours >= 12)
            military = String.format("%02d:%02d:%02d", hours, min, seconds);
        }
        // check if it is AM
        if (amPm.compareTo("AM") == 0) {
            if (hours < 12)
                military = String.format("%02d:%02d:%02d", hours, min, seconds);
            if (hours >= 12)
                military = String.format("%02d:%02d:%02d", (hours - 12), min, seconds);
        }
        return military;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
