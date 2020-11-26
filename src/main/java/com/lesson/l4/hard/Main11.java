package com.lesson.l4.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, которая:
 * 1. считывает с консоли число N, которое должно быть больше 0
 * 2. потом считывает N чисел с консоли
 * 3. выводит на экран максимальное из введенных N чисел.
 */
public class Main11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        if (N<=0) return;
        int maximum = Integer.parseInt(bufferedReader.readLine());
        for (int i=0; i<N-1;i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number>maximum) {
                maximum = number;
            }
        }
        System.out.println(maximum);
        //Написать здесь код
    }
}
