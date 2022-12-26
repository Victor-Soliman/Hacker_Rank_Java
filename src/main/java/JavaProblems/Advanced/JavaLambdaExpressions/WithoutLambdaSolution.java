package JavaProblems.Advanced.JavaLambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

// first solution without lambda expression
public class WithoutLambdaSolution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int caseNumber = input.nextInt();
            int numberToCheck = input.nextInt();
            input.nextLine();
            switch (caseNumber) {
                case 1:
                    odd(numberToCheck);
                    break;
                case 2:
                    prime(numberToCheck);
                    break;
                case 3:
                    palindrome(numberToCheck);
                    break;
            }
        }
        input.close();
    }

    public static void odd(int numberToCheck) {
        // return (int a) -> a % 2 ==0 ? false : true;
        if (numberToCheck % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }

    public static void prime(int numberToCheck) {
        //         return number -> IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);}
        if (numberToCheck < 2) {
            System.out.println("COMPOSITE");
        } else if (numberToCheck == 2) {
            System.out.println("PRIME");
        } else {
            if (numberToCheck % 2 == 0) {
                System.out.println("COMPOSITE");
            } else {
                System.out.println("PRIME");
            }

        }
    }


    public static void palindrome(Integer numberToCheck) {
        //return number -> Integer.toString(number)
        //            .equals(new StringBuilder(Integer.toString(number))
        //                    .reverse().toString());}
        String s = numberToCheck.toString();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add((int) s.charAt(i));
        }
        String left = "";
        String right = "";

        for (int i = 0; i <= left.length() - 1; i++) {
            left += left.charAt(i);
        }
        for (int j = 0; j <= right.length() - 1; j++) {
            right += right.charAt(j);
        }

        if (left.equals(right)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
    }
}
