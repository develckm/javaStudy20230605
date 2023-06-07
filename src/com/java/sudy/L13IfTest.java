package com.java.sudy;

import java.awt.Button;
import java.awt.Frame;
import java.util.Scanner;

public class L13IfTest {
	//class public : java 문서의 주인 클래스, import 가능 
	//class : 객체가 될 타입 파스칼표기법(대문자로 시작 문자결합 시 대문자, 대명사)
	
	
	
	//main : jvm이 실행되는 실질적인 어플
	//public : 접근지정자 (누구나다 접근 가능), private : 내부에서 접근가능
	//static
	
	//JVM 의 메모리 구조 
	//jvm 이 실핼될 때 주기억장치의 메모리를 임대하는데 이때 메모리 구조를 3가지로 구분 
	//1.Stack 영역: cpu에게 연산할 데이터를 저장하는 곳
	//2.Method 영역: 소스코드를 저장,(정적 static), 
	//	static 으로 선언된 변수나 함수를 저장(클래스변수), 이때 선언된 변수나 함수는 
	//  바로(jvm이 실행될때) 객체로 생성되고 절대 지워지지 않는다.
	//3.Heap 영역 : new 연산자로 생성자를 호출할 때 만들어진 객체를 저장하는 영역 
	//	예외)"문자열",{배열}
	//	이때 만들어진 객체를 인스턴스라 부르는데 GC에 의해 쓰지 않으면 지워지기 때문
	//	c라는 언어가 쓰지 않는 객체를 지우기 위해 포인터라는 것을 사용했는데 이것이 무진장
	//	어려워서 java가 인기를 얻은 이유중 하나
	// 유저 인터페이스 (UserInterface)
	// -> 유저가 어플리케이션 서비스를 이용하는 방법
	// GUI - 마우스로 화면을 조작 
	// CLI - 키보드로 콘솔(터미널) 작성한 명령어로 어플을 조작
	// NUI - 동작기반 
	// OUI - 웨어러블 
	//이클립스 
	//Console : jvm 이 실행되고 있는 콘솔
	//Terminal : 아무것도 하지않고 있는 콘솔
	public static void main(String[]args) {
		java.lang.System.out.println("안녕 자바");
		System.out.println("java.lang.*; 패키지는 기본 패키지 입니다.");
		//주석 : 동작 되지 않는 코드 
		/*설명 or 여러줄 주석*/
//		Frame f=new Frame("안녕");
//		Button btn=new Button("Button");
//		f.add(btn);
//		f.setBounds(1000, 500,300, 300);
//		f.setVisible(true);
		
		int a=10; 
		//10 정수 데이터 (메모리 저장)
		//int a : 변수 선언 (데이터를 참조)
		//int : 변수가 참조할 수있는 데이터 종류
		//a : 변수명 (카멜표기법) **모든 이름은 수로 시작할 수 없다
		//변수,상수
		//=>데이터를 재사용하기 위해 참조하는 것
		//변수(Variable) 참조하는 데이터가 바뀔 수 있다.
		//상수 처음 참조한 데이터 바뀌지 않는다. (final)
		a=20;
		System.out.println(a);	
		System.out.println(10.1);
		System.out.println(true);
		System.out.println(1==1);
		System.out.println(a+20);
		//상수(Constant) : 대문자+_ 
		final double PI=3.14; //원주율 
		//pi=3.15;
		int b=2;//반지름
		System.out.println(b*2*PI);//원 넓이
		
		
		//자바 표기할 수 있는 것들 
		//예약어 
		//class,public,(매개변수),{지역scope},[], new, void, final
		//+,-,*,/,%,....!,>,<,>=,<=.... 연산자
		//표기하는 것이 값(수)이 것(리터럴 표기법)
		//정수,실수,true,false,'b'(문자)
		//값은 아니지만 리터럴하게 표기하는 것
		//"문자열(자연어)",{배열}
		
		//type 기본으로 제공하는 타입(java.lang.*), import한 type 
		//기본형 타입 (byte,short,int,long,float,double,boolean,char)
		
		System.out.println("안녕"+"하세요");//문자열만 더하기 연산 가능
		System.out.println("안녕".concat("하세요"));
		//System.out.println(true+true);
		System.out.println('a'+'b');//??
		System.out.println(15/4); //정수 연산 정수 => 정수
		System.out.println(15.0/4); // 실수 연산 (정수|실수) => 실수
		System.out.println(Double.MAX_VALUE);
		
		//연속적인 데이터를 처리하기 위해 존재하는 자료형 배열 
		int[] numArr={10,20,30,40};
		int[] numArr2=new int[4]; //배열은 처음 만들어진 길이대로만 사용가능
		//{0,0,0,0}
		String[] strArr=new String[3];
		//{null,null,null}
		
		String s=null; //참조하는 자료가 없다.
		//int i=null;
		int i=0; //값을 대입하지 않으면 0
		
		//undefined :변수나 상수에 아무 데이터도 대입되지 않은 상태(사용할수없다.)
		String s2;
		int i2;
		//System.out.println(s2);
		
		++i;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(i++);//프린트하고 증가시켜라 
		System.out.println(i);
		System.out.println(i-=2);//i=i-2
		
		
		char [] charArr= {'a','b','c'};
		char [] charArr2= {'a','b','c'};
		//인간의 관점에서 charArr==charArr2
		//컴퓨터 입장에서는 두개가 같은지 알 방법이 없다.
		//두개가 같다는 것을 알려주기 위해 equals()
		System.out.println(charArr==charArr2);
		System.out.println(charArr.equals(charArr2));
		//배열은 equals 가 구현되지 않았다.
		
		//비교연산 (수) -> true,false
		System.out.println(i>0);
		System.out.println(i<2);
		//동등 비교 연산 -> true,false
		//수=>비교 연산
		//자료형 => 두개가 같은지 묻는다 
		System.out.println(i==1);
		System.out.println(i==1.0); 
		//1 == 1.0  둘은 다른 데이터지만 수가 같은지 확인
		System.out.println(charArr==charArr2);
		System.out.println(charArr.hashCode());
		System.out.println(charArr2.hashCode());
		charArr2=charArr;
		System.out.println(charArr==charArr2);
		
		String s5="안녕"; //{'안','녕'}
		String s6="안녕"; //{'안','녕'}
		System.out.println(s5==s6);
		//문자열은 자주 쓰는 자료형이기 때문에 (리터럴하게 표기 했을 때 ) 
		//같은 문자열이 있는지 확인하고 생성
		System.out.println(s5.hashCode()); //hashCode 객체 주소
		System.out.println(s6.hashCode());
		
		//java 가 실행되는 콘솔창에서 입력 
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		//리터럴하게 생성하지 않은 문자열
		System.out.println("당신이 입력한 문자열 :"+input);
		System.out.println(s5==input);
		System.out.println(s5.equals(input));
	}

}
