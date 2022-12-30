package JavaProblems.BigDecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();

        BigInteger bigInteger = new BigInteger(n);
        System.out.println(bigInteger.isProbablePrime(10) ? "prime" : "not prime"); // any number as certainty will work

    }
}
