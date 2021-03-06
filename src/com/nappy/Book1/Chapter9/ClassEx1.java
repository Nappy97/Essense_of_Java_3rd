package com.nappy.Book1.Chapter9;

final class Card3 {
    String kind;
    int num;

    Card3() {
        this("SPADE", 1);
    }

    Card3(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}

class ClassEx1 {
    public static void main(String[] args) throws Exception{
        Card3 c = new Card3("HEART", 3);
        Card3 c2 = Card3.class.newInstance();

        Class cobj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cobj.getName());
        System.out.println(cobj.toGenericString());
        System.out.println(cobj.toString());
    }
}
