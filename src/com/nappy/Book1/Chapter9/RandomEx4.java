package com.nappy.Book1.Chapter9;

import java.util.*;

class RandomEx4 {
    final static int RECORE_NUM = 10;
    final static String Table_NAME = "TEST_TABLE";
    final static String[] CODE1 = {"010", "011", "017", "018", "019"};
    final static String[] CODE2 = {"남자", "여자"};
    final static String[] CODE3 = {"10대", "20대", "30대", "40대", "50대"};

    public static void main(String[] args) {
        for (int i = 0; i < RECORE_NUM; i++) {
            System.out.println(" INSERT INTO " + Table_NAME
                    + " VALUES ("
                    + " '" + getRandArr(CODE1) + "'"
                    + ", '" + getRandArr(CODE2) + "'"
                    + ", '" + getRandArr(CODE3) + "'"
                    + ", " + getRand(100, 200)
                    + "); ");
        }
    }

    public static String getRandArr(String[] arr) {
        return arr[getRand(arr.length - 1)];
    }

    public static int getRand(int n) {
        return getRand(0, n);
    }

    public static int getRand(int from, int to) {
        return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
    }
}
