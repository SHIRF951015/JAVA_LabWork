package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class Lab6_1_1 {
    public static void main(String[] args) {
        int[] arrayA = new int[] {1,2,3,4};
        int[] arrayB = new int[] {3,4,5,6};
        List<Integer> listA = Arrays.stream(arrayA).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(arrayB).boxed().collect(Collectors.toList());
        getInterval(listA,listB);
        getSum(listA,listB);

    }
    public static void getInterval(List listA,List listB){
        Set<Integer> result = new HashSet<>();
        result.addAll(listA);
        result.retainAll(listB);
        System.out.println(result);
    }
    public static void getSum(List listA, List listB){
        Set<Integer> result = new HashSet<>();
        result.addAll(listA);
        result.removeAll(listB);
        result.addAll(listB);
        System.out.println(result);
    }

}
