package com.nappy.Book1.Chapter7;

class BindingTest3 {
    public static void main(String[] args) {
        Parent4 p2 = new Parent4();
        Child4 c2 = new Child4();

        System.out.println("p2.x = " + p2.x);
        p2.method();
        System.out.println();
        System.out.println("c2.x = " + c2.x);
        c2.method();

    }
}

class Parent4 {
    int x = 100;

    void method() {
        System.out.println("Parent method");
    }
}

class Child4 extends Parent4 {
    int x = 200;

    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}