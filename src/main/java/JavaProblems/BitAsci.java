package JavaProblems;

import java.util.Scanner;

public class BitAsci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long n = input.nextLong();
            System.out.println(n + " can be fitted in: ");
            if (-(int) Math.pow(2, 63) <= n && n <= (int) Math.pow(2, 63) - 1) {
                System.out.println("* long\n" + "* int\n" + "* Short\n" + "* byte");
            } else if (-(int) Math.pow(2, 31) <= n && n <= (int) Math.pow(2, 31) - 1) {
                System.out.println("* int\n" + "* Short\n" + "* byte");
            } else if (-(int) Math.pow(2, 15) <= n && n <= (int) Math.pow(2, 15) - 1) {
                System.out.println("* Short\n" + "* byte");
            } else if (-128 <= n && n <= 127) {
                System.out.println("* byte");
            } else
                System.out.println(input.nextInt() + " can't be fitted anywhere.");
        }
    }
}