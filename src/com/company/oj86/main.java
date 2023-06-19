package com.company.oj86;

import java.util.Scanner;

public class main {
    public static int deal(int str1, int str2, int str3) {
        str1 = str2 * str1 * str3;
        return str1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            System.out.println(deal(a,b,c));
        }
        scanner.close();
    }
}
