package JavaProblems.Algorithms.BitManipulation.FlippingBits;

import java.io.IOException;
import java.util.Scanner;
/*
 * Complete the 'flippingBits' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER n as parameter.
 */


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        String binaryRepresentation = getBinary(n);

        String temp = "";
//
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            Character c = binaryRepresentation.charAt(i);

            if (c.toString().equals("1")) {
                temp = temp + "0";
            } else {
                temp = temp + "1";
            }
        }
        System.out.println(Long.parseUnsignedLong(temp, 2));

    }

    public static String getBinary(long n) {

        String result = Long.toBinaryString(n);

        return String.format("%32s", result).replaceAll(" ", "0");
    }
    // second solution
    /* Integer.MAX_VALUE = 1111111111111111111111111111111;
     * MAX value of signed int consist of 31 1s.
     * But we need 32 bit mask for XOR operation.
     * So, doing left shift the MAX value with 1 and adding 1 to
     * make it 32 bit and performing XOR operation with n (Toggling).
     */
//        System.out.println(((((long) Integer.MAX_VALUE) << 1) + 1) ^ n);
}
