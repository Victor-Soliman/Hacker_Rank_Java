package JavaProblems.Advanced.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {
//“\\b”: A word boundary. Boundaries are needed for special cases. For example, in “My thesis is great”,
// “is” won't be matched twice.
//“\\w+” A word character: [a-zA-Z_0-9]
//
//“\\W+”: A non-word character: [^\w]
//
//“\\1”: Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
//
//“+”: Match whatever it’s placed after 1 or more times

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);  // treat the case-insensitive

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));   // replace all the repeated words with the first one
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}