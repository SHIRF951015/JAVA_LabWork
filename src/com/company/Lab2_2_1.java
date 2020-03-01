package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Lab2_2_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number n:");
        int n = scan.nextInt();
        System.out.println("Please enter the number k:");
        int k = scan.nextInt();
        int[][] arr = new int[n][n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = random.nextInt((n-(-n))+1)+(-n);
            }

        }
        String s1 = Arrays.deepToString(arr);
        System.out.println("Before sorting:"+s1);
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++){
                if(arr[j][k] > arr[j+1][k]){
                    int[] temp = new int[n];
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String s2 = Arrays.deepToString(arr);
        System.out.println("After sorting:"+s2);




    }
}
