package com.nappy.Book1.Chapter7;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv2 extends Product {
    Tv2() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구매하셨습니다");
    }
}

class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv2());
        b.buy(new Computer2());

        System.out.println("현재 남은돈은" + b.money + " 입니다");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + " 입니다");
    }
}
