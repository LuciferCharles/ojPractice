package com.company.oj104;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int r = scanner.nextInt();
            int v = scanner.nextInt();
            deal(r, v);
        }
        scanner.close();
    }

    private static void deal(int r, int v) {

        if (r % v == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private  static boolean judge()
}