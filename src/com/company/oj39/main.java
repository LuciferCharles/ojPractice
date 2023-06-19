package com.company.oj39;


import java.util.Scanner;

public class main {
    public static void deal(int begin, int n) {
        if (begin < 0) {
            begin = 0;
        }
        for (int i = 0; i < n; ) {
            if (begin % 2 == 0 || begin == 0) {
                System.out.println(begin);
                begin++;
                i++;
            } else {
                begin++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int begin = scanner.nextInt();
            int n = scanner.nextInt();
            deal(begin, n);
        }
        scanner.close();
    }
}
