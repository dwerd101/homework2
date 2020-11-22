package com.lesson.l4.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
 * Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
 * Если имена и длины имен разные - ничего не выводить.
 */

/*
Требования:
Программа должна считывать две строки c клавиатуры.
Программа должна содержать System.out.println() или System.out.print()
Если имена одинаковые вывести сообщение "Имена идентичны"
Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
Если имена и длины имен разные - ничего не выводить.
 */
public class Main4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        //Написать здесь код
    }
}
