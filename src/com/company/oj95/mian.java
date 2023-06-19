package com.company.oj95;


import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int r = scanner.nextInt();
            deal(r);
        }
        scanner.close();
    }

    private static void deal(double r) {
        String s = String.valueOf(r);
        System.out.println(s.charAt(1)+""+s.charAt(0));
    }
}
