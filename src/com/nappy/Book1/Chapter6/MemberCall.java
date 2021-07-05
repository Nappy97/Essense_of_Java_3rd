package com.nappy.Book1.Chapter6;

class MemberCall {
    int iv= 10;
    static int cv = 20;

    int iv2= cv;
    // static int cv2 = iv  //에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음
    static int cv2 = new MemberCall().iv;

    static void staticMethod1(){
        System.out.println(cv);
        //System.out.println(iv);   //에러. 클래스 메서드에서 인스턴스 변수를 사용불가
        MemberCall c= new MemberCall();
        System.out.println(c.iv);   //객체를 생성한 후에야 인스턴스 변수의 참조가능
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); // 인스턴스 메서드에서는 인스턴스 변수 사용가능
    }

    static void staticMethod2(){
        staticMethod1();
        //instanceMethod1()   // 에러. 클래스 메서드에서는 인스턴스 메서드를 호출 불가
        MemberCall c = new MemberCall();
        c.instanceMethod1();    //인스턴스를 생선한후에야 호출가능
    }

    void instanceMethod2() {        // 인스턴스 메서드에서는 인스턴스 메서드와 클래스 메서드 모두 인스턴스 생성없이 바로 호출가능하다
        staticMethod1();
        instanceMethod1();
    }
}
