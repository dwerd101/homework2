package com.lesson.l4.easy;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них.
 * Если числа равны между собой, необходимо вывести любое.
 */
/*
Требования:
Программа должна считывать числа c клавиатуры.
Программа должна выводить число на экран.
Программа должна выводить на экран максимальное из четырёх чисел.
Если максимальных чисел несколько, необходимо вывести любое из них.
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int number3 = Integer.parseInt(bufferedReader.readLine());
        int number4 = Integer.parseInt(bufferedReader.readLine());

        //все 4 числа равны между собой (это мои мечты) или только нескольк?


        if (number1 > number2 && number1 > number3 && number1 > number4) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println(number2);
        } else if (number3 > number1 && number3 > number2 && number3 > number4) {
            System.out.println(number3);
        } else if (number4 > number1 && number4 > number2 && number4 > number3) {
            System.out.println(number4);
        } else if (number1 == number2 && number2 == number3 && number3 == number4) {
            System.out.println(number1);

        }
        //Напиши здесь код
    }
}
