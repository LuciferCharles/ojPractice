package com.company.oj104;

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
        String string = String.valueOf(r);
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            flag = string.charAt(i) == '9';
            if (flag){
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}