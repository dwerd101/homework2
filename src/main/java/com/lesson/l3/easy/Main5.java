package com.lesson.l3.easy;

/**
 *
 *  Как зовут кота?
 *
 */

/*
Помогите коту обрести имя с помощью метода setName.

Требования:
Класс Cat должен содержать только одну переменную name.
Переменная name должна иметь модификатор доступа private и тип String.
Класс Cat должен содержать только два метода setName и main.
Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
 */
public class Main5 {

    public static class Cat {
        private String name = "безымянный кот";

        public void setName(String name) {
          //Напиши здесь код
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }

    }


}
