package com.java.sudy;
//구현할 모듈(클래스)의 집합
//클래스에 유일한 이름을 제공
//최경민(경기도 고양시 샘터마을2단지 777동 301호) 최경민 (경기도 고양시 햇빛마을 )최경민 (경기도 고양시 호수공원 )
//java.lang.System com.java.study.System 

//public(클래스 앞에) : 
//class : type 객체지향 문법에서 class 는 구현해야할 객체를 추상화해서 문서화하는(type) 것
//class의 속성 : 자원,필드,전역변수
//class의 메소드 : 실행
public class L01Data {//42분까지 
	public L01Data(){} //생성자 new 연산자로 객체를 만들때 호출
	
	static double PI=3.14; //float의 2배크기 실수
	//이때 static으로 정의된 속성과 메소드는 클래스의 데이터가 아니다.
	//JVM 실행되기의해서 생성하는 메모리 영역(메소드) 저장(멤버 변수)
	
	String msg="안녕!"; //String :  문자열을 저장하는 type
	int a=10; //int(integer) : 정수
	float f=3.14f; //실수 4Byte
	
	//java 가 개발을 위해 제공하는 데이터 타입
	//자료형 (class) : 기본형 (수) 
	
	//187.14 => 1.8714 * 10^2
	//(default 접근지정자 : 패키지 내부의 클래스끼지 접근 가능)
	void print () {
	}
	//**main 함수는 오직 1개만 작성 (실질적인 어플)
	public static void main(String [] args) {
		System.out.println(L01Data.PI);
		//System.out.println(L01Data.msg);
		L01Data a=new L01Data(); //type으로 정의한 class를 객체로 생성
		//new 연산자로 생성자를 호출 : 인스턴스 객체
		//변수 a: 생성한 객체를 재사용하기 위해 참조하는 것 
		System.out.println(a.msg); 
		// "." : 필드 접근자 (객체의 속성 접근)
		System.out.println(a.f);
		System.out.println(a.a);
		
		String msg= "객체와 데이터 수업입니다.";
		//메소드에 선언된 변수 : 지역("{}",SCOPE)변수 
		//지역변수 데이터가 생성되는 시점은 메소드가 실행될 때
		System.out.println(msg);
	}
}
class MouseBtn{
	
}
class Mouse{
	MouseBtn rightBtn;
	MouseBtn leftBtn;
	MouseBtn wheel;
	public void operateClick() {
		///~~~~~~~~
	}
	public void optionClick() {
		///~~~~~~~~
	}

}




