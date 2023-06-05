package com.java.sudy;

public class L02PrimitiveDataType {
	public static void main(String [] args) {
		boolean b=true;
		//비교연산을 했을때 반환하는 결과 
		// ==,>=,<=,>,<,!(NOT)
		System.out.println(-1>0);
		byte b2=127;//??
		//byte : 8bit 로 표현할 수 있는 정수 
		// 2^0~ 2^7 
		// 1 1 1 1 1 1 1 1 => 2^8 256 -> -128 0 127
		short s=32767;//-2^15~2^15-1
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		//java.lang.* 랩퍼클래스 
		//수만 저장하능한 기본형을 지원하는 자료형
		//Integer,Byte,Short,Long,Float,Double,Boolean,Character
		int i=2147483647; //32bit
		//**자바에 작성된 모든 정수는 기본 int 를 적용
		//자바에서 21억보다 리터럴하게 표현할 수있는 큰정수는 없다.
		
		long l=9223372036854775807l;//64bit
		//수를 작성하면(리터럴) 기본 int 로 생각하기 때문에
		//long 타입의 정수를 사용한다고 명시해야함 (l,L)
		System.out.println(Long.MAX_VALUE);
		
		//** 변수의 선언과 대입
		byte b3; //변수 선언
		b3=55; //55 data가 만들어지고 b3 이 55를 참조함 
		
		System.out.println(3);//3은 무슨 정수 타입일까??
		
		char c='a';//'' : 문자 (문자표의 번호)
		c=65; 
		System.out.println(c);
		System.out.println((int)c); //캐스팅 형변환
		c='안';
		System.out.println(c);
		System.out.println((int)c);
		//char 2byte ??? : 유니코드를 2byte로 생각해서...
	}
}
