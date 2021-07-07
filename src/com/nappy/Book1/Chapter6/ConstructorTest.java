package com.nappy.Book1.Chapter6;

class Data1 {
    int value;
}

class Data4 {
    int value;

    Data4(int x) {
        value = x;
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data4 d2 = new Data4(10);
    }
}
