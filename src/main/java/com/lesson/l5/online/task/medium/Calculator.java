package com.lesson.l5.online.task.medium;

/**
Калькулятор
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) – возвращает сумму чисел a и b
int minus(int a, int b) – возвращает разницу чисел a и b
int multiply(int a, int b) – возвращает результат умножения числа a на число b
double division(int a, int b) – возвращает результат деления числа a на число b
double percent(int a, int b) – возвращает процент b из числа a
*/
public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        int min = a - b;
        return min;
    }

    public static int multiply(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static double division(int a, int b) {
        int div = a / b;
        return div;
    }

    public static double percent(int a, int b) {
       int per = a * b / 100;
        return per;
    }

    public static void main(String[] args) {

        System.out.println(Calculator.percent(1000,10));

    }
}
