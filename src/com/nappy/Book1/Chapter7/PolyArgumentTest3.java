package com.nappy.Book1.Chapter7;

import java.util.*;

class Product3 {
    int price;
    int bonusPoint;

    Product3(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product3() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv4 extends Product3 {
    Tv4() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer4 extends Product3 {
    Computer4() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product3 {
    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product3 p) {
        if (money < p.price) {
            System.out.println("not enough money");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println("buy" + p);
    }

    void refund(Product3 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println("refund" + p);
        } else {
            System.out.println("you dont have this item");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("you don't have this item");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product3 p = (Product3) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : "," + p;
        }

        System.out.println("total sum" + sum);
        System.out.println("stuffs are" + itemList);
    }
}

class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        Tv4 tv = new Tv4();
        Computer4 com = new Computer4();
        Audio2 audio = new Audio2();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
