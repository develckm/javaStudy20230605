package com.java.sudy;

public class L22Function {
	//함수 : 무언가를 받아서(파라미터) 행동
	//sum : 2개의 값을 입력(매개변수,파라미터) 받으면 그 값을 더해서 출력(콘솔)
	//static : 클래스 변수 (자바가 실행될 때 메소드 메모리 영역에 생성**따로 생성할 필요가 없다. )
	public static void sum(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		//+ 더하기 연산은 문자열이 수보다 우선순위가 높다(수를 문자열로 바꾼다.)
	}
	//**이름과 매개변수의 수와 타입이 같을 수 없다.
	//public static void sum(int a,int b) {}
	//**함수의 이름은 같은데 수나 타입이 다를 수있다. 오버로딩 Overloading
	//**이름이 같은데 역할이 많다. 객체지향문법의 다형성 Polymorphism
	//다형성 : 이름 짓기가 너무너무 힘들어서
	public static void sum(int a,int b,int c) {
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));

	}
	public static void main(String[] args) {
		sum(20,30);
		sum(40,44,55);
	}
	
}
