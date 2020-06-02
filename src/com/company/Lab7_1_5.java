package com.company;
import java.util.*;
public class Lab7_1_5 {
    public static void main(String[] args) {
        StringBuffer stringBuilder1=new StringBuffer("20180918");
        stringBuilder1.insert(6,"-");
        stringBuilder1.insert(4,"-");
        StringBuilder stringBuilder2=new StringBuilder("1234abcdabc12");
        int index = stringBuilder2.indexOf("abc");
        stringBuilder2.insert(index,"131");
    }

}
