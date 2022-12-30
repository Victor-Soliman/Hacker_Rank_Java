package JavaProblems.Introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            try {

                long number = input.nextLong();
                System.out.println(number + " can be fitted in:");
                if (number >= -128 && number <= 127) System.out.println("* byte");
                // short
                if (Short.MIN_VALUE <= number && number <= Short.MAX_VALUE) {
                    System.out.println("* Short");
                }// int
                if (Integer.MIN_VALUE <= number && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                } // long
                if (Long.MIN_VALUE <= number && number <= Long.MAX_VALUE) {
                    System.out.println("* Long");
                }

            } catch (Exception e) {
                System.out.println(input.next() + " can't be fitted anywhere\n ");
            }
        }
    }
}