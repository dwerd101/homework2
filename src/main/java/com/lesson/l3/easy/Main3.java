package com.lesson.l3.easy;

public class Main3 {

    public static void main(String[] args) {


        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("The Age in adjustAge() is " + this.age);
        }
    }
}
