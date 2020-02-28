package com.company;
import java.util.Scanner;

public class Lab1_1_5 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of integers:");
        int num = scan.nextInt();
        int[] Ary = new int[num];
        System.out.println("Please enter the number:");
        int sum = 0;
        int pro = 1;
        for (int i = 0; i < Ary.length; i++){
            Ary[i] = scan.nextInt();
            sum += Ary[i];
            pro *= Ary[i];
        }
        System.out.println("Sum="+sum);
        System.out.println("pro="+pro);



    }

}
