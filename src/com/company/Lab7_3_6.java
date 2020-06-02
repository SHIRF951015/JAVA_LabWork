package com.company;
import java.util.*;
public class Lab7_3_6 {
    public static void main(String[] args) {
        System.out.println("Enter text from several sentences: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arrayString = str.split("[\\!|\\.|\\?]\\s?");
        String[] stringResult = new String[arrayString.length];
        for (int i = 0; i < arrayString.length; i++){
            stringResult[i] = arrayString[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$4 $1$2");
        }
        for (String s : stringResult){
            System.out.println(s);
        }
    }

}
