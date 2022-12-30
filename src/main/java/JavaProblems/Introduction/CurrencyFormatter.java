package JavaProblems.Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner doublePrecisionNumber = new Scanner(System.in);
        double payment = doublePrecisionNumber.nextDouble();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        System.out.println("US: " + us);
        String india = NumberFormat.getCurrencyInstance(new Locale("EN","IN")).format(payment);
        System.out.println("India: " + india);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        System.out.println("China: " + china);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("France: " + france);
    }
}
