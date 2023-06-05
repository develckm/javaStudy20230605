package com.java.sudy;

import java.io.IOException;
import java.util.Scanner;

public class L08IfElseEx {
	//입력받은 수의 홀 짝을 구하세요 if else
	//문자 1개를 입력 받고 그 문자가 알파벳인지 확인하세요
	public static void main(String [] args) {		
		int su=(int) (Math.random()*3);
		System.out.println(su);//가위 0 바위 1 보 2 
		System.out.println("가위 바위 보 게임 ("+su+")");
		System.out.print("가위,바위,보(0,1,2) : ");

		
		Scanner scanner=new Scanner(System.in);
		System.out.print("수를 입력하세요(홀짝 구해줌):");
		String numStr=scanner.nextLine();
		
		
		scanner=new Scanner(System.in);
		System.out.print("문자를 입력하세요(알파벳인지 확인함):");
		String alphabetStr=scanner.nextLine();
		//**문자열을 문자로 형변환하지 못하고 문자열의 특정 인덱스의 문자를 빼올 수있음
		char alphabet=alphabetStr.charAt(0);
	}
	
}
