package com.company;

import java.util.Scanner;

public class Lab1_2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputStr = s.nextLine();
        String[] strArray = inputStr.split(" ");
        int[] num = new int[strArray.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println("odd");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1)
                System.out.println(num[i]);
        }
        System.out.println("even");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0)
                System.out.println(num[i]);
        }
    }
}
