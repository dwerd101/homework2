package com.lesson.l3.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * *
 * Исправить ошибку. Сравнение объектов
 * Сравнение объектов Main8 не работает должным образом. Найти ошибку и исправить.
 * Метод main не участвует в тестировании.
 */
 /* Требования:
 * 1. Хешкоды одинаковых объектов должны быть равны.
 * 2. Метод equals должен проверять равен ли переданный объект равен текущему(сравнение через ==).
 * 3. Метод equals должен проверять является ли переданный объект объектом класса Main8.
 * 4. Метод equals должен возвращать true в случае, если поля first и last равны у переданного
 * объекта и текущего(не забудь что они могут быть равны null).
 * 5. Должно быть обеспечено корректное поведение HashSet с типом элементов Main8.
 * 6. В классе Main8 должен быть реализован метод hashCode.
 */
public class Main8 {
    private final String first, last;
    public Main8(String first, String last) {
        this.first = first;
        this.last = last;
    }
    public static void main(String[] args) {
        Set<Main8> s = new HashSet<>();
        s.add(new Main8("Mickey", "Mouse"));
        System.out.println(s.contains(new Main8("Mickey", "Mouse")));
    }
}
