package com.company.oj96;


import java.math.BigInteger;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            deal(a, b);
        }
        scanner.close();
    }

    private static void deal(int a, int b) {
        String stra = String.valueOf(a);
        String strb = String.valueOf(b);
        BigInteger bigA = new BigInteger(stra);
        BigInteger bigB = new BigInteger(strb);
        BigInteger multiply = bigA.multiply(bigB);
        System.out.println(multiply);
    }
}
