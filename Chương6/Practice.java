/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson06;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Practice {

    

    public static int getSum(int... arr) {
        int s = 0;
        for (int x : arr) {
            s += x;
        }
        return s;
    }

    public static final double sum(double ... x) {
        double s = 0;
        for (double a : x) {
            s += a;
        }
        return s;
    }

    public static final double getMin(double... x) {
        double min = x[0];
        for (double a : x) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double max = x[0];
        for (double a : x) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        char c;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                c = (char) (str.charAt(i) - 32);
                s += c;
            } else {
                c = str.charAt(i);
                s += c;
            }
        }
        return s;
    }

    public static String toLower(String str) {
        char c;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                c = (char) (str.charAt(i) + 32);
                s += c;
            } else {
                c = str.charAt(i);
                s += c;
            }
        }
        return s;
    }

    public static String toUpperFirstchar(String str) {
        String result = "";
        String s = toLower(str);
//        System.out.println(s);
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
            char firstChar = words[i].charAt(0);  //lay ra ky tu dau
            String sFirstChar = String.valueOf(firstChar); //doi ky tu dau sang kieu string
//            System.out.println(upperFirstChar);
            String upperFiStChar = toUpper(sFirstChar);//viet hoa ky tu dau
//            System.out.println(ktdau);
            words[i] = upperFiStChar + words[i].substring(1); //cong ky tu dau vua vua viet hoa va chuoi ban dau con lai
            result = String.join(" ", words); //ghep cac tu lai thanh 1 chuoi
        }
        return result;
    }

    public static long getFibonacci(int position) {
         if (position <= 1 ) {
            return position;
        } else {
            return (getFibonacci(position - 1) + getFibonacci(position - 2));
        }
    }
    
    
}
