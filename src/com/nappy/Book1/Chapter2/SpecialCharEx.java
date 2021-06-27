package com.nappy.Book1.Chapter2;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');   // '''처럼 할 수 없다
        System.out.println("abc\t123\b456");    // \b에 의해 3이 지워진다
        System.out.println('\n');   // 개행(new line) 문자 출력하고 개행
        System.out.println("\"Hello\"");    // 큰따움표를 출력하고 싶을때
        System.out.println("c:\\");

    }
}
