package com.company.oj01;

import java.util.Scanner;



public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.print(a + b);
        }
        scanner.close();
    }
}
