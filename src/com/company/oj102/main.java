package com.company.oj102;


import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double t = scanner.nextDouble();
            deal(a, b, c, t);
        }
        scanner.close();
    }

    private static void deal(double a, double b, double c, double t) {
        double va = 1 / a;
        double vb = 1 / b;
        double vc = 1 / c;
        double x = (1 - t * (va + vb)) / (va + vb - vc);
        x = x + t;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String format = decimalFormat.format(x);
        System.out.println(format);
    }
}
