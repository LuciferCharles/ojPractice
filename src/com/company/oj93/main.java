package com.company.oj93;


import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void deal(double c){
        double f = 1.8 * c + 32;
        DecimalFormat format = new DecimalFormat("#0.00");
        System.out.println(format.format(f));
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
