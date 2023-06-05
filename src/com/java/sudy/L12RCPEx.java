package com.java.sudy;

import java.util.Scanner;

public class L12RCPEx {
	public static void main(String [] args) {
		//while(조건){} : 조건이 false 일때까지 반복하겠다. 
		System.out.println("가위 바위 보 게임 시작~!");
		while(true) {
			System.out.print("가위 바위 보 중 하나를 입력 : ");
			Scanner scanner=new Scanner(System.in);
			String inputStr=scanner.nextLine();
			//문자열은 리터럴하게 선언한것만 동등비교(==)할 수있다.
			//통신해서 받아온 문자열은 인스턴스객체를 새롭게 만들기 때문에 equals()로 비교
			int randomNum=(int)(Math.random()*3); //0~2
			String [] rspArr= {"가위","바위","보"};
			int num=0;
			switch(inputStr) { 
				case "가위": num=0; break;
				case "바위": num=1; break;
				case "보": num=2; break;
				default: num=10; break;
			}
			System.out.println("내가입력 :("+num+")"+inputStr);
			System.out.println("컴퓨터 :("+randomNum+")"+rspArr[randomNum]);
			String result="";
			switch(num-randomNum) {
				case 0: result="비김"; break;
				case 1:case -2: result="승"; break;
				case -1:case 2: result="패"; break;
				default : result="가위 바위 보 중에 하나만 입력"; break;
			}
			System.out.println("결과 :"+result);
			
		}
	}
}
