package JavaProblems.Introduction;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int j = 0; j < t; j++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                a = (int) (a + Math.pow(2, i) * b);
                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }
}
