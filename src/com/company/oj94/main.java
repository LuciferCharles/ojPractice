package com.company.oj94;


import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double w = scanner.nextDouble();
            double h = scanner.nextDouble();
            deal(w, h);
        }
        scanner.close();
    }

    private static void deal(double w, double h) {
        double bmi = w / (h * h);
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println(decimalFormat.format(bmi));
    }
}
