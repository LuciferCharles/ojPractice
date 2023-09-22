package com.company.oj105;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double r = scanner.nextDouble();
            deal(r);
        }
        scanner.close();
    }

    private static void deal(double r) {
        if (r>55.4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}