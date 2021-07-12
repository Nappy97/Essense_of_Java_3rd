package com.nappy.Book1.Chapter7;

class BindingTest2 {
    public static void main(String[] args) {
        Parent3 p1 = new Parent3();
        Child3 c1 = new Child3();

        System.out.println("p.x = " + p1.x1);
        p1.method1();

        System.out.println("c.x = " + c1.x1);
        c1.method1();
    }
}

class Parent3 {
    int x1 = 100;

    void method1() {
        System.out.println("Parent method");
    }
}

class Child3 extends Parent3 {
}
