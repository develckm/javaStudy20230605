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
			//https://github.com/develckm/javaStudy20230605
		}
	}
	//L13GradeCalcEx : switch로 입력받은 점수를 학점으로 변환 (10 or 5를 나누세요 )
	//L14UpDownGameEx : 컴퓨터가 1부터 100 사이의 수 중에 하나를 고른 후 
	//사용자가 5번 안에 맞추는 게임 
	//컴퓨터가 랜덤 수로 70 을 선택
	//사용자가 50을 입력 
	//컴퓨터가 50이 70보다 작으니 업! 을 출력
	//사용자가 90을 입력 
	//컴퓨터가 70보다 크니 다운! 을 출력
	//사용자가 75를 입력
	//컴퓨터가 70보다 크니 다운! 을 출력
	//사용자가 70을 입력
	//컴퓨터가 승! 
}
