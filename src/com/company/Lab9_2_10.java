package com.company;
import java.util.*;
import java.util.stream.Collectors;


public class Lab9_2_10 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 22, 111, 3, 3, 15,6,20,40);
        List<Integer> bignums = nums.stream().filter(num -> num >10).collect(Collectors.toList());
        Integer sum = bignums.stream().reduce((x,y)->x+y).get();
        System.out.println(sum);
    }
}
