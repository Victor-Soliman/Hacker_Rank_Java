package JavaProblems;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstStringInput = input.next();
        int firstIntInput = input.nextInt();

        String secondStringInpur = input.next();
        int secondIntInput = input.nextInt();

        String thirdStringInput = input.next();
        int thirdIntInput = input.nextInt();

        System.out.println("===========");
        System.out.printf("%-15s%03d%n" ,firstStringInput ,firstIntInput);
        System.out.printf("%-15s%03d%n" ,secondStringInpur ,secondIntInput);
        System.out.printf("%-15s%03d%n" ,thirdStringInput ,thirdIntInput);

        System.out.println("===========");
    }
}
