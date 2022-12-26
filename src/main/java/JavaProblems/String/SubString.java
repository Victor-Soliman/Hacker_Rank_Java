package JavaProblems.String;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        int start = input.nextInt();
        int end = input.nextInt();

        String substring = s.substring(start, end);
        System.out.println(substring);
    }
}
