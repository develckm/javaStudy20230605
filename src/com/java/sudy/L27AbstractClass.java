package com.java.sudy;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
* OOP 에서 객체 설계 방법 -> 추상화
* interface -> 구현 abstract class -> 완전구현 -> class -> 사용 객체
* 다형성(오버로드,오버라이드,타입),캡슐화(접근지정자)
* */
abstract class C implements A,B{
    //추상 메서드를 사용할 수있는 추상클래스(클래스와 똑같다.)
    //인터페이스 -> 추상클래스(중간단계설계도) -> 클래스 -> 객체
    //**추상메서드를 모두 구현하기 힘들때 추상클래스를 사용한다.
    int a;
    String s;
    public int sum(){
        return 0;
    }
    abstract public int sum(int a,int b); //추상메서드
}
public class L27AbstractClass {
    public static void main(String[] args) {
        //컬렉션s 컬렉션프레임워크 : 자바가 제공하는 사용하기 편한 자료구조들
        //Array 배열 : 고정길이
        //고정길이가 불편해서 ArrayList 를 제공 (길이 변경이 가능)
        //내부반복문 제공(foreach), 정렬, 검색, 잘라내기 ...
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        int [] arr={10,20,30,40,50};//유사한 자료
    }
}
