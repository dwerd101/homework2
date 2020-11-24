package com.lesson.l4.easy;

/**
 * Реализуй метод boolean fight(Cat anotherCat):
 * продумай механизм драки котов в зависимости от их веса, возраста и силы.
 * Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
 * Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
 * Если ничья и никто не выиграл, возвращаем false.
 */
 /* Требования:
 * Класс Cat должен содержать конструктор без параметров.
 * Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
 * В классе Cat должен быть метод fight.
 * В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
 * Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
 * Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
 */
public class Main7 {
// дубль два
    public static class Cat {
        public int age;
        public int weight;
        public int strength;

        public Cat() {
        }

        public boolean fight(Cat anotherCat) {
            int win = 0;

            if (this.age > anotherCat.age) {
                win++;
            }

            if (this.weight > anotherCat.weight) {
                win++;
            }

            if (this.strength > anotherCat.strength) {
                win++;
            }
            if (win >= 2) {
                return true;
            }
            return false;
        }
        //напиши тут код
    }

    public static void main(String[] args) {
        Cat vaska = new Cat();
        Cat petro = new Cat();

        vaska.age = 3;
        vaska.strength = 6;
        vaska.weight = 5;

        petro.age = 7;
        petro.strength = 5;
        petro.weight = 7;

        boolean result1 = vaska.fight(petro);
        boolean result2 = petro.fight(vaska);

        System.out.println(result1);
        System.out.println(result2);

    }
}
