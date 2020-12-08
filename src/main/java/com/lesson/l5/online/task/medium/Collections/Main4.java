package com.lesson.l5.online.task.medium.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. Создай список строк в методе main.
 * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
/* Требования:
 * Объяви переменную типа список строк и сразу проинициализируй ee.
 * Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
 * Программа должна добавлять строки в начало списка.
 * Программа должна выводить список на экран, каждое значение с новой строки.
 */
public class Main4 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i< 10; i++) {
            list.add  (0, bufferedReader.readLine()); //не пойму как работает этот ноль, но без него не работает
        }
//        Collections.reverse(list);
//        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        
    }
}
