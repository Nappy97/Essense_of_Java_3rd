package com.nappy.Book1.Chapter7;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product2() {
    }
}

class Tv3 extends Product2 {
    Tv3() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer3 extends Product2 {
    Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product2 {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer1 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] item = new Product2[10];
    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을 구매");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }

        System.out.println("총 금액은 " + sum);
        System.out.println("제품은 " + itemList);
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();

        b.buy(new Tv3());
        b.buy(new Computer3());
        b.buy(new Audio());
        b.summary();
    }
}
