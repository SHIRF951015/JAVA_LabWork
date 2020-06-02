package com.company;
import java.util.*;
public class Lab5_2 {
    public static void main(String[] args) {
        Bookcase bookcase1 = new Bookcase("Single desk", 210,508);
        bookcase1.Info();
        try{
            bookcase1.readModel();
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        System.out.println(bookcase1.getModel());
    }
}
