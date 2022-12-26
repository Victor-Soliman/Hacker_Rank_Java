package JavaProblems.String;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tesCases = Integer.parseInt(input.nextLine());
        while (tesCases > 0) {
            String pattern = input.nextLine();
            try {
                Pattern compile = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
