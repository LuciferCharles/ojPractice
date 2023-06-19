package com.company.oj90;

import java.util.Scanner;

public class main {
    public static void deal(int whole) {
        int single = whole % 10;
        int mid = ((whole % 100) - single) / 10;
        int pre = (whole - (whole % 100)) / 100;
        System.out.println(pre);
        System.out.println(mid);
        System.out.println(single);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int whole = scanner.nextInt();
            deal(whole);
        }
    }
}
