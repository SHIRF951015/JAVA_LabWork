package com.company;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Lab2_1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Developer: SHI,Receive task time:"+df.format(new Date()));
        System.out.println("Please enter the number of lines:");
        String str = s.nextLine();
        int num = Integer.parseInt(str);
        String[] strArray = new String[num];
        int index1 = 0;
        int index2 = 0;
        System.out.println("Please enter characters:");
        for (int i = 0;i < num;i++){
            strArray[i] = s.nextLine();
            if(strArray[i].length() > strArray[index1].length()){
                index1 = i;
            }
            if(strArray[i].length() < strArray[index2].length()){
                index2 = i;
            }
        }
        System.out.println("The longest one:"+strArray[index1]);
        System.out.println("length:"+strArray[index1].length());
        System.out.println("The shortest one:"+strArray[index2]);
        System.out.println("length:"+strArray[index2].length());

        System.out.println("Task completion time："+df.format(new Date()));




    }
}
