package com.java.sudy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L20ArrayEx {

	public static void main(String[] args) {
		double [] scoreArr= {14.5,6.6,60,33,55.5,88.3,47.7};
		//평균을 while문 구하고 for문으로 구해보세요~
		//1부터 20까지 수를 더하세요 ~
		//=>1부터 20까지 수 중에 홀수만 더하세요
		double sum=0;
//		int i=0;
//		while(i<scoreArr.length) {
//			double score=scoreArr[i++];
//			sum+=score;
//		}
		for(int i=0; i<scoreArr.length; i++) {
			double score=scoreArr[i];
			sum+=score;
		}
		
		
		System.out.println("점수의 평균은 :"+(sum/scoreArr.length));
		
		
		int [] numArr= {-1,2,3,-4,5,6,-7,8,-9};
		//검사식 : 배열에서 음수를 찾아서 양수로 바꾸세요 (음수의 수를 반한 하세요)
		int mSize=0; //음수의 수
		for(int i=0; i<numArr.length; i++) {
			int num=numArr[i];
			if(num<0) {
				numArr[i]=-(num);
				++mSize;
				//numArr[i]=Math.abs(num);//절대값(양수만)
			}
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println("해당 배열의 음수의 수는 : "+mSize);
		
		
		//**구구단 7단을 출력하세요
		//7x1=7;
		//7x2=14;
		//7x3=21;
		// ...
		//7x9=63;
		int dan=7;
		System.out.println("구구단 7단 출력");
		for(int i=1; i<10; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
		}
		
		
		
		
		
		//up down 게임을 반복으로 만들어보세요~ (5번 안에 종료)
		
		System.out.println("up down 게임을 시작하겠습니다. \n1~100까지 랜덤하게 고른 수중 1개를 5번 안에 맞추세요!");
		//int randomNum=new Random().nextInt(1, 101);
		int randomNum=(int)(Math.random()*100)+1;
		System.out.println("컴퓨터가 고른 수"+randomNum);
		int i=1;
		boolean win=false;
		while(i<=5 && !win) { //두개의 조건중 하나만 true 면 true
			Scanner scanner=new Scanner(System.in);
			String inputNumStr=scanner.nextLine();
			int inputNum=Integer.parseInt(inputNumStr);
			if(inputNum<randomNum) {
				System.out.println("Up 더 큰 수를 입력하세요!");
			}else if(inputNum> randomNum) {
				System.out.println("Down 더 작은 수를 입력하세요!");
			}else {
				win=true;
			}
			i++;
		}
		if(win) {
			System.out.println((i-1)+"번째 만에 승리");
		}else {
			System.out.println("패배");
		}
		
		
		// || (or,합집합,더하기) 하나라도 true 인지
		// true || true => true
		// true || false => true
		// false || false => false 
		
		// && (and,교집합,곱하기) 모두가 true 인지
		// true || true => true
		// true || false => false
		// false || false => false 

		
	
	}

}
