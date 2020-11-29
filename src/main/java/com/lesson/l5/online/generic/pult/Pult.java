package com.lesson.l5.online.generic.pult;

public interface Pult<E extends SonyPult> {
    void button1(E e);
    void button2();
    void button3();
}
