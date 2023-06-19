package com.company.oj99;


import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double v = scanner.nextDouble();
            double a = scanner.nextDouble();
            deal(a, v);
        }
        scanner.close();
    }

    private static void deal(double a, double v) {

        double result = (v * v) / (2 * a);

        DecimalFormat format = new DecimalFormat("#0.00");
        String format1 = format.format(result);
        System.out.println(format1);
    }
}
