package com.company.oj97;

import java.math.BigInteger;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int r = scanner.nextInt();
            deal(r);
        }
        scanner.close();
    }

    private static void deal(int n) {
        String value = String.valueOf(n);
        BigInteger bigInteger = new BigInteger(value);
        BigInteger big1 = new BigInteger("1");
        BigInteger big2 = new BigInteger("2");
        BigInteger sum = bigInteger.multiply(bigInteger.add(big1)).divide(big2);
        System.out.println(sum);
    }
}
