package com.company.oj92;

import java.text.DecimalFormat;
import java.util.Scanner;


public class main {
    public static void deal(double r) {
        double length = 2 * 3.14 * r;
        DecimalFormat format = new DecimalFormat("#0.00");
        System.out.println(format.format(length));

        double area = 3.14 * r * r;
        System.out.println(format.format(area));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double r = scanner.nextDouble();
            deal(r);
        }
        scanner.close();
    }
}
