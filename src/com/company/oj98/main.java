package com.company.oj98;


import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double r = scanner.nextDouble();
            double h = scanner.nextDouble();
            deal(r, h);
        }
        scanner.close();
    }

    private static void deal(double r, double h) {
        double area = r * r * 3.14;
        DecimalFormat format = new DecimalFormat("#0.00");
        String s = format.format(area);
        System.out.println(s);
        double v = area * h;
        String s1 = format.format(v);
        System.out.println(s1);
    }
}
