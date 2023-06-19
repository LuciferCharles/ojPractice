package com.company.oj101;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int r = scanner.nextInt();
            deal(r);
        }
        scanner.close();
    }

    private static void deal(int r) {
        String bigInteger = String.valueOf(r);
        int flag = 0;
        for (int i = 0; i < bigInteger.length(); i++) {
            flag = flag + Integer.parseInt(String.valueOf(bigInteger.charAt(i)));
        }
        System.out.println(flag);
    }
}
