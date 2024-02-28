package javacore.basic.lesson06;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dell
 */
public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void nhapMang(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();

        }
    }

  
    public static void main(String[] args) {

        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();//dong1
            double [] a=new double [n];
            nhapMang(a);

            sc.nextLine();
            String str1 = sc.nextLine();//dong 3
            String str2 = sc.nextLine();//dong 4
            //sc.nextLine();
            int k = sc.nextInt();//

            System.out.printf("Case #%d:\n", i);
            System.out.printf("Sum: %.2f\n", Practice.sum(a));
            System.out.printf("Min: %.1f\n", Practice.getMin(a));
            System.out.printf("Max: %.1f\n", Practice.getMax(a));
            System.out.printf("To upper: %s\n", Practice.toUpper(str1));
            System.out.printf("To lower: %s\n", Practice.toLower(str2));
            System.out.printf("To upper first char: %s - %s\n", Practice.toUpperFirstchar(str1), Practice.toUpperFirstchar(str2));
            System.out.printf("Fibonacci(%d): %d\n", k, Practice.getFibonacci(k));
        }

    }
}
