package com.lesson.l5.online.iterator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        for (Integer b: list) {
            System.out.println(list);
        }


        for (Integer b: list) {

        }

        System.out.println(" ");
        //Аналогично
        for(int i=0; i<list.size(); i++) {
            Integer b = list.get(i);
            System.out.println(b);
        }
        System.out.println(" ");

        //Расширенная запись foreach
        Iterator<Integer> a = list.iterator();
        while (a.hasNext()) {
          int b = a.next();
          System.out.println(b);
        }
    }
}
