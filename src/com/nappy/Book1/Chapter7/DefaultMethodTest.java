package com.nappy.Book1.Chapter7;

class DefaultMethodTest {
    public static void main(String[] args) {
        Child5 c = new Child5();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child5 extends Parent5 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in child");   // 오버라이딩
    }
}

class Parent5 {
    public void method2() {
        System.out.println("method2() int Parent");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() int MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}