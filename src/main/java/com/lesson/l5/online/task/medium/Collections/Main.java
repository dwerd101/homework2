package com.lesson.l5.online.task.medium.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

/*
  Усложним задачу.
  Реши эту задачу одной или двумя строчками используя Java 8.
  (Если сможешь :D)
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("bat");
        arrayList.add("owl");
        arrayList.add("rat");
        System.out.println(arrayList.size());
        for (String s : arrayList) {
            System.out.println(s);

        }

    }
}
