package com.company;

public class Lab3_ {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{-1,-2,-0,-0,3};
        Vector vec1 = new Vector(arr1);
        Vector vec2 = new Vector(arr2);
        vec1.collinear_or_orthogonal(vec2);
    }
}
class Vector{
    public int n;
    public int[] arr;
    public int nub;

    public Vector(int len) {
        n = len;
        arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=1;
        }
    }
    public Vector(int[]init) {
        n = init.length;
        arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=init[i];
        }
    }
    //метод для вычисления модуля вектора
    public int Vector_modulus(){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i]*arr[i];
        }
        return (int) Math.sqrt(sum);
    }
    //метод для скалярного произведения
    public int scalar_product(Vector vec){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i]*vec.arr[i];
        }
        return sum;
    }
    //метод для сложения
    public int[] addition(Vector vec){
        int[] arr = new int[n];
        for (int i = 0;  i < arr.length; i++) {
            arr[i] = arr[i]+vec.arr[i];
        }
        return arr;
    }
    //метод для вычитания
    public int[] Subtraction(Vector vec){
        int[] arr = new int[n];
        for (int i = 0;  i < arr.length; i++) {
            arr[i] = arr[i]-vec.arr[i];
        }
        return arr;
    }
    //метод для умножения на константу
    public int[] multiplication_constant(Vector vec){
        int[] arr = new int[n];
        for (int i = 0;  i < arr.length; i++) {
            arr[i] = arr[i]*vec.nub;
        }
        return arr;
    }
    //коллинеарными или ортогональными
    public void collinear_or_orthogonal(Vector vec){
        boolean isCol = true;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]*vec.arr[i+1]!=arr[i+1]*vec.arr[i]){
                isCol = false;
                break;
            }
        }
        boolean isOrt = false;
        if(this.scalar_product(vec)==0){
            isOrt = true;
        }
        if (isCol){
            System.out.println("collinear");
        }
        else if(isOrt){
            System.out.println("orthogonal");
        }
        else{
            System.out.println("Not collinear or orthogonal");
        }

    }


}