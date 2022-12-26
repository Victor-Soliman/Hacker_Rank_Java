package JavaProblems.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {

        // in caz general
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        String result = "";
//        while (testCases > 0) {
//            String line = in.nextLine();
//
//            String regex = "(<[^>]*>)";
//            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//
//            Matcher matcher = pattern.matcher(line);
//
//            while (matcher.find()) {
//                result = line.replaceAll(regex, "");
//
//            }
//            testCases--;
//            System.out.println(result);
//        }

        // optimal Solution for Hacker rank
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases-- > 0) {
            String line = in.nextLine();

            String tag = "<(.+)>([\\w]+[^<]*)</(\\1)>";
            Pattern p = Pattern.compile(tag);
            Matcher m = p.matcher(line);

            if (!m.find()) {
                System.out.println("None");
                continue;
            }

            m.reset();
            while (m.find()) {
                System.out.println(m.group(2));
            }
        }
    }
}
