package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class Lab9_1_4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        List<Integer> evens = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        List<Integer> odds = nums.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println(evens);
        System.out.println(odds);
    }
}
