package JavaProblems.Algorithms.Implementation.Easy.ModifiedKaprekarNumbers;

import java.io.IOException;
import java.util.Scanner;


/*
 * Complete the 'kaprekarNumbers' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER p
 *  2. INTEGER q
 */

// the both solution don't pass hacker rank
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int p = input.nextInt();

//        List<Long> result = new ArrayList<>();
//
//        for (long number = p; number <= q; number++) {
//            long square = number * number;
//
//            String stringNumber = String.valueOf(square);
//            int length = stringNumber.length();
//            String left = stringNumber.substring(p, length / 2);
//            String right = stringNumber.substring(length / 2, length);
//
//            if (left.isEmpty()) {
//                left = "0";
//            }
//
//            if (right.isEmpty()) {
//                right = "0";
//            }
//
//            Long leftLong = Long.valueOf(left);
//            Long rightLong = Long.valueOf(right);
//
//            if (leftLong + rightLong == number) {
//                result.add(number);
//            }
//
//        }
//
//        if (result.isEmpty()) {
//            System.out.println("INVALID RANGE");
//        } else {
//
//            for (Long n : result) {
//                System.out.print(n + " ");
//            }
//            System.out.println();
//        }
        boolean flag = false;
        for (int number = p; number <= q; number++) {
            int l = Integer.toString(number).length();
            long base = (long) Math.pow(number, l);
            long pow = (long) Math.pow(number, 2);
            long mod = pow % base;
            long a =  (pow - mod) / base;

            if (a + mod == number) {
                System.out.printf("%d ", number);
                flag = true;
            }
        }

        if (!flag) System.out.printf("%s","INVALID RANGE");
    }
}
