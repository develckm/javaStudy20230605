package com.java.sudy;

import java.util.Scanner;

public class L11SwitchEx {
	public static void main(String []args) {
		//Math : 연산을 도와주는 라이브러리
		//java.util.* : import 해야하는 라이브러리(IO,Date,자료구조)
		//java.lang.* : 자동으로 import 되어 있는 라이브러리(랩퍼클래스,Math)
		System.out.println(Math.ceil(3.4)); //올림
		System.out.println(Math.floor(-3.6)); //내림
		System.out.println((int)-3.6); //캐스팅 형변환으로 소수점 버림
		System.out.println(Math.round(4.6));
		System.out.println(Math.random());
		//0 ~ 소수점 17자리 까지 랜덤수반환
		System.out.println((int)Math.random()*100);
		//연산자 우선 순위에 의해 캐스팅 형변환이 먼저 되서 무조건 0
		System.out.println((int)(Math.random()*100)+1);
		
		
		//0~2까지 수를 랜덤하게 뽑아 보세요
		int num=(int)(Math.random()*3);
		System.out.println(num);
		//0가위,1바위,2보 (컴퓨터가 선택한 0~2 를 가위 바위 보로 출력하세요)
		String rsp="";
		switch(num) {
			case 0:
				rsp="가위";
				break;
			case 1:
				rsp="바위";
				break;
			case 2:
				rsp="보";
				break;
		}
		System.out.println("컴퓨터는 "+rsp);
		
		System.out.print("가위 바위 보 입력 :");
		Scanner scanner=new Scanner(System.in);
		String inputStr=scanner.nextLine();
		//입력 받은 가위 바위 보 를 0,1,2  로 바꾸세요 
		int input=0;
		
		//25분까지 쉬었다가 오세요~ 
		//나 컴퓨터
		//0 - 0/ 1 - 1 / 2 - 2 = 0 (비김)
		//승
		//1 - 0 (바위 - 가위) = 1
		//2 - 1 (보 - 바위) = 1
		//0 - 2 (가위 - 보) = -2
		//패
		//0 - 1 (가위 - 바위) = -1
		//1 - 2 (바위 - 가위) = -1
		//2 - 0 (보 - 가위) = 2

		System.out.println("당신의 입력은 :"+inputStr+" 승 or 패 or 비김");
	}
}
