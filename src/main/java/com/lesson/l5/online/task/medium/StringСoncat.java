package com.lesson.l5.online.task.medium;

/**
 * Сделать класс StringСoncat, у которого будут 2 статических метода:
 * String multiply(String s, int count) - возвращает строку повторенную count раз.
 * String multiply(String s) - возвращает строку повторенную 5 раз.
 *
 * Пример:
 * Амиго -> АмигоАмигоАмигоАмигоАмиго
 */
 /* Требования:
 * Программа не должна считывать данные с клавиатуры.
 * Методы класса StringСoncat должны возвращать строку.
 * Методы класса StringСoncat должны быть статическими.
 * Методы класса StringСoncat должны быть public.
 * Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
 * Метод multiply(String s) должен возвращать строку повторенную 5 раз.
 */
public class StringСoncat {

    public static String multiply(String s) {
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
    }
        return s;
}

    public static String multiply(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
        return s;
    }

    public static void main(String[] args) {
       StringСoncat.multiply("hi");

    }
}
