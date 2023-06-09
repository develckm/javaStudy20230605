package com.java.sudy;
//@어노테이션 컴파일할 때 자동으로 만들거나 검사
//@FunctionalInterface
//람다식을 사용하는 인터페이스 정의
//람다식
//객체지향 언어에서 함수는 데이터가 아니기 때문에 매개변수로 사용될 수 없다.
//때문에 함수를 매개변수로 사용하기 위해서 타입을 정의하고 생성하는 번거로운 일을
//해야한다.(코드가 길어진다.) -> 생산성가 유지보수가 함수형 언어보다 떨어지더라
//그래서 등작한것이 람다식이다 ()->{}(화살표 함수)

@FunctionalInterface
interface LoopAppFunc{
    void run();
    //void run2();
}
class LoopApp{
    //자바는 함수를 매개변수로 사용할 수없다.
    //자바에서는 함수를 데어터와 타입 취급하지 않는다.
    //자바에서는 데이터로 (자료형과 기본형 뿐이다.)
//    public void start(function a){
//        for (int i=0; i<5; i++){
//            a();
//        }
//    }
    public void start(LoopAppFunc a) {
        for (int i = 0; i < 5; i++) {
            a.run();
        }
    }
}

class LoopAppFuncImp implements LoopAppFunc{
    @Override
    public void run() {
        System.out.println("안녕안녕안녕!!");
    }
}

public class L28Lambda {
    public static void main(String[] args) {
     /* 특정함수(콜백함수) 5번 실행하는 프로그램을 제작*/
//        LoopAppFunc loopAppFunc=new LoopAppFunc() {
//            @Override
//            public void run() {
//                System.out.println("안녕안녕!");
//            }
//        };
        LoopAppFunc loopAppFunc=new LoopAppFuncImp();
        LoopApp loopApp=new LoopApp();
        loopApp.start(loopAppFunc);

        loopApp.start(new LoopAppFunc() {
            @Override
            public void run() {
                System.out.println("김정선씨 바보!");
                System.out.println("허두원씨 똑똑이!");
            }
        });
        //()->{} : 람다식
        loopApp.start(()->{
            System.out.println("최경민 강사 똑똑이");
        });

    }
}
