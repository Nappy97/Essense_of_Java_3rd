package com.nappy.Book2.Chapter10;

import java.util.*;

class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2015, 7, 31);

        System.out.println(toString(date));
        System.out.println("= after day1=");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= before 6months=");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println(" after day31 (roll) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= after day 31(add) = ");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
