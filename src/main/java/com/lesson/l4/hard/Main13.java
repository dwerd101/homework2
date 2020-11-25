package com.lesson.l4.hard;

/**
 * Создай классы Dog, Cat, Mouse
 * Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс,
 * на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
 * Пример:
 * Mouse jerryMouse = new Mouse(“Jerry”, 12/*высота, см , 5 /*длина хвоста, см )
 */
public class Main13 {
    public static void main(String[] args) {
        Cat tomCat = new Cat("Tom", 5, 15);
        Mouse jerryMouse = new Mouse("Jerry", 9, 3);
        Dog bobikDog = new Dog("Bobik", 4, 10);
    }

    public static class Cat {
        private String name;
        private int age;
        private int tailLength;

        public Cat(String name, int age, int tailLength) {
            this.name = name;
            this.age = age;
            this.tailLength = tailLength;
        }
    }

    public static class Dog {
        private String name;
        private int age;
        private int tailLength;

        public Dog(String name, int age, int tailLength) {
            this.name = name;
            this.age = age;
            this.tailLength = tailLength;
        }
    }

    public static class Mouse {
        private String name;
        private int age;
        private int tailLength;

        public Mouse(String name, int age, int tailLength) {
            this.name = name;
            this.age = age;
            this.tailLength = tailLength;
        }
    }

}
