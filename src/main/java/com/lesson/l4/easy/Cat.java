package com.lesson.l4.easy;
/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например,
 если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
Тот параметр который не передан в аргументах нужно определить в методе.
*/
public class Cat {
    String name;
    int age;
    int weight;
    String color;
    String address;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;

    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
    }
    public void initialize(int weight, String color, String name, int age) {
        this.weight = 4;
        this.name = color;
        this.name = null;
        this.age = 4;

    }
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.name = color;
        this.address = null;

    }
}
