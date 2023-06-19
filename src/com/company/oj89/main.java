package com.company.oj89;


import java.util.Scanner;

public class main {
    public static void deal(int whole) {
        System.out.println((whole - (whole % 10)) / 10);
        System.out.println(whole % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int whole = scanner.nextInt();
            deal(whole);
        }
    }
}
