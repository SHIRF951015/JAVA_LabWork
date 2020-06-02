package com.company;
import java.io.*;
import java.util.*;
public class Lab5_3_1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Stone\\Desktop\\English.txt");
        try (InputStream is = new FileInputStream(file)) {
            byte[] data = new byte[1024];
            is.read(data);
            String str1 = new String(data);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the string you want to delete:");
            String str2 = scan.nextLine();
            Lab5_3_1 test = new Lab5_3_1();
            Object[] result = test.deleteSubString(str1,str2);
            System.out.println("Text content:" + new String(data));
            System.out.println("After deleting the specified string："+result[0]);
            System.out.println("Totally deleted " +result[1] + " time(s)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Object[] deleteSubString(String str1,String str2) {
        StringBuffer sb = new StringBuffer(str1);
        int delCount = 0;
        Object[] obj = new Object[2];

        while (true) {
            int index = sb.indexOf(str2);
            if(index == -1) {
                break;
            }
            sb.delete(index, index+str2.length());
            delCount++;
        }
        if(delCount!=0) {
            obj[0] = sb.toString();
            obj[1] = delCount;
        }else {
            obj[0] = -1;
            obj[1] = -1;
        }
        return obj;
    }
}
