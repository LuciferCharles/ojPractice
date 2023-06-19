package com.company.oj87;


import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void deal(double a, double b) {
        double length = a * 2 + b * 2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(length));
        double area = a * b;
        System.out.println(decimalFormat.format(area));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            deal(a, b);
        }
    }
}
