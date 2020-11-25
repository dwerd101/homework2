package com.lesson.l4.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
 */
 /* Требования:
 * Программа должна дважды считать данные c клавиатуры.
 * Программа должна использовать команду System.out.println() или System.out.print().
 * Если возраст меньше 18 вывести только сообщение "Подрасти еще".
 * Если возраст больше либо равно 18 ничего не выводить.
 */
public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());

        if (age<18) {
            System.out.println("Подрасти еще");
        }
        }

    }
