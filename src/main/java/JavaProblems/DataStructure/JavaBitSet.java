package JavaProblems.DataStructure;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // size of BitSet
        int m = input.nextInt(); // number of operation
        input.nextLine();

        BitSet b1 = new BitSet(n); // 00000
        BitSet b2 = new BitSet(n); // 00000

        for (int i = 0; i < m; i++) {
            String operation = input.next();
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            switch (operation) {
                case "AND":
                    if (num1 == 1 && num2 == 2) {
                        b1.and(b2);
                    } else if (num1 == 2 && num2 == 1) {
                        b2.and(b1);
                    } else if (num1 == 1 && num2 == 1) {
                        b1.and(b1);
                    } else if (num1 == 2 && num2 == 2) {
                        b2.and(b2);
                    }
                    break;

                case "OR":
                    if (num1 == 1 && num2 == 2) {
                        b1.or(b2);
                    } else if (num1 == 2 && num2 == 1) {
                        b2.or(b1);
                    } else if (num1 == 1 && num2 == 1) {
                        b1.or(b1);
                    } else if (num1 == 2 && num2 == 2) {
                        b2.or(b2);
                    }
                    break;

                case "XOR":
                    if (num1 == 1 && num2 == 2) {
                        b1.xor(b2);
                    } else if (num1 == 2 && num2 == 1) {
                        b2.xor(b1);
                    } else if (num1 == 1 && num2 == 1) {
                        b1.xor(b1);
                    } else if (num1 == 2 && num2 == 2) {
                        b2.xor(b2);
                    }
                    break;

                case "FLIP":
                    if (num1 == 1) {
                        b1.flip(num1);
                    } else if (num2 == 2) {
                        b2.flip(num2);
                    }
                    break;

                case "SET":
                    if (num1 == 1) {
                        b1.set(num2);
                    } else if (num1 == 2) {
                        b2.set(num2);
                    }
                    break;

            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());

        }

    }
}
