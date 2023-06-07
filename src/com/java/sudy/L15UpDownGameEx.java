package com.java.sudy;

import java.util.Scanner;
// Math.random()*n  => 0~n 랜덤
//(int)0.123 * 10
//-> 0 * 10 (x)
//(int)(0.123 * 10)
//->(int)(1.23) -> 1
//System.out.println((int)(randomNum*100)+1);
public class L15UpDownGameEx {
	public static void main(String []args) {
		System.out.println("업다운 게임~ 시작 3번만에 맞추세요!");
		
		double randomNum=Math.random();
		int choiceNum=((int)(randomNum*100))+1;
		System.out.println("컴퓨터가 선택한 수 :"+choiceNum);
		boolean win=false;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1번째 수를 맞춰 보세요~ (1~100):");
		String inputNumStr=scan.nextLine(); //data통신은 문자열사용
		int inputNum=Integer.parseInt(inputNumStr);
		//"78"->78 로 변환 (Integer int의 랩퍼 클래스)
		if(inputNum>choiceNum) {
			System.out.println("Down!");
		}else if(inputNum<choiceNum){
			System.out.println("Up!");
		}else { //승리
			win=true;
		}
		if(!win) {			
			System.out.println("2번째 수를 맞춰 보세요~ (1~100):");
			inputNumStr=scan.nextLine(); //data통신은 문자열사용
			inputNum=Integer.parseInt(inputNumStr);
			//"78"->78 로 변환 (Integer int의 랩퍼 클래스)
			if(inputNum>choiceNum) {
				System.out.println("Down!");
			}else if(inputNum<choiceNum){
				System.out.println("Up!");
			}else { 
				win=true;
			}
			if(!win) {
				System.out.println("3번째 수를 맞춰 보세요~ (1~100):");
				inputNumStr=scan.nextLine(); //data통신은 문자열사용
				inputNum=Integer.parseInt(inputNumStr);
				//"78"->78 로 변환 (Integer int의 랩퍼 클래스)
				if(inputNum>choiceNum) {
					System.out.println("Down!");
				}else if(inputNum<choiceNum){
					System.out.println("Up!");
				}else { 
					win=true;
				}
				if(!win) {
					System.out.println("게임 끝 실패!!!");
				}else {
					System.out.println("세번째만에 승리!");
				}
			}else {
				System.out.println("두번째만에 승리!");
			}
		}else {
			System.out.println("첫트만에 승리!");
		}

		
	}
}
