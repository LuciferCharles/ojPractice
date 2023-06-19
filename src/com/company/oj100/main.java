package com.company.oj100;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int money = scanner.nextInt();
            deal(money);
        }
        scanner.close();
    }

    private static void deal(int money) {
        double result = 0D;
        int flag = 0;
        while (flag < 6) {
            result = (result + money) * 1.00417;
            flag++;
        }
        DecimalFormat format = new DecimalFormat("#0.00");
        String string = format.format(result);
        System.out.println("$" + string);
    }
}
