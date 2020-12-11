package com.lesson.l5.online.task.medium.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
 */
/*Требования:
В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
Программа должна выводить самую длинную строку на экран.
Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
 */
public class Main2 {

    public class Solution {

        private List<String> strings;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
//        String max = Collections.max(list, Comparator.comparing(String::length));
//        System.out.println(max);
        int max2 = 0;
        for (String s : list) {
            if (s.length() > max2) {
                max2 = s.length();
            }
        }
        for (String s : list) {
            if (s.length() == max2) {
                System.out.println(s);
            }
        }
    }
}









