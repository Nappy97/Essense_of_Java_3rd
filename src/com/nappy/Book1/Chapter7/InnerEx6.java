package com.nappy.Book1.Chapter7;

class InnerEx6 {
    Object iv = new Object() {
        void method() {
        }
    };
    static Object cv = new Object() {
        void method() {
        }
    };

    void myMethod() {
        Object lv = new Object() {
            void method() {
            }
        };
    }
}
