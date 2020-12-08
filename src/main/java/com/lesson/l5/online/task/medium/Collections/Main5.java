package com.lesson.l5.online.task.medium.Collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
/*Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и добавлять их в список.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.
*/
public class Main5 {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(list.size() - 1)); //частично из инета, зачем -1?
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }
    }
}
