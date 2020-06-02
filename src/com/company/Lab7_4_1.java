package com.company;
import java.util.*;
public class Lab7_4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of word:");
        int num = input.nextInt();
        String[] strArr = new String[num];
        System.out.println("enter the number：");
        for(int i = 0;i < strArr.length;i++) {
            strArr[i] = input.next();
        }
        wordSort(strArr);

    }
    public static void wordSort(String[] strArr) {
        for(int i = strArr.length - 1;i > 0;i--) {
            for(int j = 0;j < i;j++) {
                if(strArr[j].compareToIgnoreCase(strArr[j + 1]) > 0) {
                    String temp = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = temp;
                }
            }
        }
        for(String i : strArr) {

            System.out.println(i);
        }
    }
}
