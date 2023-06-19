package com.company.oj88;


import java.util.Scanner;

public class main {
    public static void deal(int a, int b) {
        a = a % b;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            deal(a, b);
        }
    }
}
