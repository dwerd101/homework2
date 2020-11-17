package com.lesson.l3.easy;


/** Новые возможности!
 Используя возможности enum-а реализуйте метод getLetterPosition, который должен возвращать позицию буквы (A - 1).
 Не должно быть закоментированного кода.
 */

/*
    Класс Main должен содержать enum Alphabet.
    Alphabet должен содержать по порядку 26 букв английского алфавита
    Метод getLetterPosition у Класса Alphabet должен возвращать позицию буквы в алфаите.
    Метод getLetterPosition должен вызвать метод ordinal
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Alphabet.G.getLetterPosition());
    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;

        int getLetterPosition() {
            return -1;
        }
    }
}
