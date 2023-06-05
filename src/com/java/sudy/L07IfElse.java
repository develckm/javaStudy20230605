package com.java.sudy;

import java.util.Scanner;

public class L07IfElse {
	public static void main(String [] args) {
		/* 입출력 IO : 통신 (data(String) 를 주고Output 받는것 Input )
		 * System.in : System jvm을 실행중인 콘솔창 (java L07IfElse)에서 입력을 받는 것 
		 * 입력 : 문자열을 쓰고 엔터 
		 * java.util.Scanner : 입출력을 처리를 도와주는 내부 라이브러리
		 * java.util.* : 개발자를 도와주는 내부 라이브러리 패키지
		 * scanner.nextLine(); : 이 구문에서 콘솔창에 입력이 있을 때 까지 멈춘다. 
		 * 						문자열을 쓰고 엔터를 누르면 해당 문자열을 입력받아서 반환
		 * Integer : int 의 랩퍼 클래스 (기본형의 처리를 돕는다.)
		 * 랩퍼클래스.parse*(문자열) : 문자열을 기본형으로 변경
		 * */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("점수를 입력하면 성적을 계산합니다.");
		System.out.print("성적입력 : ");
		String scoreStr=scanner.nextLine();
		//**입출력은 무조건 문자열을 주고 받는다
		int score=Integer.parseInt(scoreStr);//"77" => 77
		//score는 0~100까지 수만 입력 가능
		if(score>=0 && score<=100) {//0~100 의 수를 입력 받으면 성적(A~F)
			String grade="A+";
			if(score>=95) {
				grade="A+";
			}else if(score>=90) {
				grade="A";
			}else if(score>=85) {
				grade="B+";
			}else if(score>=80) {
				grade="B";
			}else if(score>=75) {
				grade="C+";
			}else if(score>=70) {
				grade="C";
			}else if(score>=65) {
				grade="D+";
			}else if(score>=60) {
				grade="D";
			}else {
				grade="F";
			}
			System.out.println("당신의 성적은 "+grade+"입니다.");
		}else {//score 를 제대로 입력하라고 경고!
			System.out.println("점수는 0~100까지 수만 입력 가능합니다.");
		}
		//if else 문법 
	}
}
