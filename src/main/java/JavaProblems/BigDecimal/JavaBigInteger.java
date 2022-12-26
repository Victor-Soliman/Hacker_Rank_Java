package JavaProblems.BigDecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        // first solution
//        Scanner input = new Scanner(System.in);
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//        BigInteger a = BigInteger.valueOf(number1);
//        BigInteger b = BigInteger.valueOf(number2);
//
//        System.out.println(Integer.parseInt(String.valueOf(a.add(b))));
//        System.out.println(a.multiply(b));

        // second solution hackerrnk
//        Scanner input = new Scanner(System.in);
//        BigInteger a = new BigInteger(input.next());
//        BigInteger b = new BigInteger(input.next());
//
//        System.out.println(a.add(b));
//        System.out.println(a.multiply(b));

        Scanner input = new Scanner(System.in);
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
