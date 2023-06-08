package com.java.sudy;

import java.util.Scanner;

public class L17ThreadWhile {
	public static void main(String[] args) {
		//*main 을 실행하면 한개의 스레드가 제공 
		//만약 while문을 사용하면 스레드를 독점
		String s="";
		boolean b=true;
		while(b) {//"x"라는 문자열을 입력하면 반복문을 종료하세요.
			Scanner scanner=new Scanner(System.in);
			System.out.print("문자열을 입력 (x 종료): ");
			s=scanner.nextLine(); //입력받은 문자열은 리터럴하게 선언된 것이 아니라서 새로운 객체
			if(s.equals("x")) {				
				b=false; //while 은 내부에서 종료하는 조건을 만들어야 한다. 
			}
		}
		System.out.println("입력한 문자열은 :"+s);
	}
}
