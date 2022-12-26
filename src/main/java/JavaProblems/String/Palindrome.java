package JavaProblems.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();

        String left = "";
        String right = "";

        for (int i = 0; i <= a.length() - 1; i++) {
            left += a.charAt(i);
        }

        for (int j = a.length() - 1; j >= 0; j--) {
            right += a.charAt(j);
        }
        if (left.equals(right)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
