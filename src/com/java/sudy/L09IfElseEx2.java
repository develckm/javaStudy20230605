package com.java.sudy;

public class L09IfElseEx2 {
	public static void main(String []args) {
		int a=0; //양수인지 음수 인지 확인하세요,0은 양수도 음수도 아니다.
		//String b="8";
		//2개의 조건 중에 1개를 고른다 => if
		//양수인지 음수인지 => 연산을 해야하는 구나~ 주어진 값이 수인가??
		if(a>0) {//양수
			System.out.println("a는 양수");
		}else if(a==0) {
			System.out.println("a는 0");
		}else{
			System.out.println("a는 음수");
		}
		char c='D'; //해당 문자가 소문자인지 대문자인지 확인하세요~
		//캐릭터가 수로 형변환되는 시점 : 연산 (비교연산,산술연산)
		System.out.println((int)c); //캐스팅 형변환
//		if( c>=65 && c<=90 ) {
//			System.out.println("c는 대문자 입니다.");
//		}
//		if( c>=97 && c<=122 ) {
//			System.out.println("c는 소문자 입니다.");
//		}
//		if( !(( c>=65 && c<=90) || ( c>=97 && c<=122 )) ) {
//			System.out.println("c는 알파벳이 아닙니다.");
//		}
		
		
	}
}
