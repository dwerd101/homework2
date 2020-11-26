package com.lesson.l4.hard;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *  Вывести на экран сегодняшнюю дату
 * Вывести на экран текущую дату в аналогичном виде "21 02 2014".
 *
 */
public class Main12 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(date));

    }
}
