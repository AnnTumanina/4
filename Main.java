package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = in.nextInt();
        int[] chchch = new int[n];
        System.out.println("Введите числа массива");
        for (int i = 0; i < chchch.length; i++) {
            chchch[i] = in.nextInt();
        }
        int min = chchch[0];
        for (int i : chchch) {
            if (i < min)
                min = i;
        }
        int sss = 0;
        for (int m : chchch) {
            sss += m;
        }
        int sum = min + (sss / n);
        System.out.println("Ответ: " + sum);
    }
}