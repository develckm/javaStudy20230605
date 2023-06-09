package com.java.sudy;

/**
 * class
 * java : 자료형 데이터의 타입(타입)
 * OOP : 객체를 추상화 한것
 * 전역변수(Attribute) : 객체의 필드(멤버)로 작성됨
 * 함수(method) : 객체의 행동(실행)
 * 생성자(constructor) : 객체의 필드를 초기화
 *  이름이 클래스명이다. 이유는 생성자가 반환하는 타입이 클래스기 때문
 * [초기화:객체가 생성될때 속성 값을 대입]
 * new : new 연산자로 클래스의 생성자를 호출하면 인스턴스 객체가 생성
 */
class Calc { //계산기
    //전역변수는 undefined 상태일 수 없다. 때문에 무조건 기본 값(0,null)대입
    private int a;
    private int b;
    public Calc(){}//default 생성자
    //전역변수 a b 를 객체를 생성할 때 초기화 하고 싶습니다.
    //그러면 누구를 재정의 해야하나요???
    public Calc(int a,int b){
        //this는 Calc가 객체일때 객체자신을 의미하고 객체의 필드(전연변수)를
        //접근할 때 사용
        //전역변수와 지역변수의 이름이 같을 때는 지역변수가 우선순위가 높다.
        this.a=a;
        this.b=b;
    }
    public int sum(){
        int sum=0;
        sum=a+b;//this는 생략가능
        return sum;
    }

    //함수 이름앞에 void  or 타입은 반환값의 타입을 지정
    public int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }
}


public class L23Class {
    public static void main(String[] args) {
        //static (클래스변수)가 아닌 것은 꼭 객체를 만들어 사용해야한다.
        Calc calc=new Calc(); //생성자는 클래스 이름이랑 똑같다.
        System.out.println(calc.sum(111,667));
        System.out.println(calc.sum());

        Calc calc1=new Calc(50,100);
        System.out.println(calc1.sum());
        //calc1.a=77;// private으로 선언된 필드는 클래스 내부에서만 접근 가능
    }
}
