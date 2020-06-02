package com.company;
import java.io.*;
import java.util.*;
public class Lab5_4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("English.txt"));
        ArrayList<String> list = new ArrayList<String>();
        String line ;
        while((line = br.readLine()) != null){
            list.add(line);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("English2.txt"));
        for(int i = list.size() - 1;i >= 0 ; i--){
            bw.write(list.get(i));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
