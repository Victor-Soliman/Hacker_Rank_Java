package JavaProblems.Introduction;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 1;

        System.out.printf("%d %s %n", counter, input);
        while (scanner.hasNext()) {
            counter++;
            System.out.printf("%d %s %n", counter, scanner.nextLine());

        }
    }
}
