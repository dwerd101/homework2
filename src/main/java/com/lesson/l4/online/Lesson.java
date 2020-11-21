package com.lesson.l4.online;

public class Lesson {
    public static void main(String[] args) {


      /*  //До версии JDK 5, писали так
        Integer integer = new Integer(5);
        Double doublezz = new Double(1.0);
        Float floatzz = new Float(11.0);
        String text = new String()
        Long l = new Long(32);
        Byte b = new Byte("1");
        method(integer);
        method(doublezz);
        method(floatzz);
        method(l);
        //Автоупаковка
        //После версси JDK 5, начили писать
        Integer integer1 = 5;
        Double doublezz1 = 1.0;
        Float floatzz1 = 11.0f;
        Long l1 = 32l;
        Byte bb1 = 1;
        //Автораспоковка
        //До версии JDK 5, писали так
        int a = integer.intValue();
        double d = doublezz.doubleValue();
        float f = floatzz.floatValue();
        long l11 = l.longValue();
        byte b1 = b.byteValue();
        //После версси JDK 5, начили писать
        int a1 = integer;
        double d1 = doublezz;
        float f1 = floatzz;
        long l111 = l;
        byte b11 = b;




        Integer iOb1 = 100;
        Integer iOb2 = 100;
        System.out.println(iOb1 == iOb2); //true
        System.out.println(iOb1.intValue()==iOb2.intValue()); //true

        Integer iOb3 = new Integer(120);
        Integer iOb4 = new Integer(120);
        System.out.println(iOb3 == iOb4); //false

        Integer iOb5 = 200;
        Integer iOb6 = 200;
        System.out.println(iOb5 == iOb6); //false, т.к.который кэширует значения от -128 до 127*/

        /*
         Integer
        Double
        Float f
        Long l
        Byte b
        Классы обертки
         */

        long lll = 333;
        int aaaa = (int) lll;
        Integer iOb5 = 200;
        method(aaaa);
        method(iOb5);
        //Обертка — это специальный класс, который хранит внутри себя значение примитива.

        inta(3, 3, 2, 4, 5);
        inta(1, 1);


    }


    public static void method(int iOb) {
        System.out.println("Integer");
    }

    public static void method(Double iOb) {
        System.out.println("double");
    }

    public static void method(Float iOb) {
        System.out.println("float");
    }

    public static void method(Long iOb) {
        System.out.println("Long");
    }

    public static void inta(int... a) {
        int b[] = a;

        for (int c = 0; c < b.length; c++) {
            System.out.print(b[c]);
        }
        System.out.println("");
    }



   /* Main3 main = new Main3();
    //Жизненый цикл объекта начинается тогда, когда мы его создаем
    main = null;
    //Garabage Collector
    //Включаектся тогда, когда не имеют ссылку на объект
    //
    Main3 main1 = new Main3();
    Main3 main3 = new Main3();
    main3 = main1;
    //Garabage Collector
    //Включаектся тогда, когда не имеют ссылку на объект
    //finalize


        for(int i =0 ; i<1000; i++) {
        Main3 main31 = new Main3();
        main31 = null;*/
}
