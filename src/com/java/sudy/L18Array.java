package com.java.sudy;

import java.util.Arrays;

public class L18Array {
	public static void main(String[] args) {
		//배열은 인덱스와 길이가 있는 자료 
		int [] arr=new int [4];
		//배열에 자료를 참조시키는 방법 
		//배열변수[index]=data;
		arr[0]=77;
		arr[1]=88;
		arr[2]=99;
		arr[3]=111;
		
		//배열의 자료가 어떤것이 있는지 보려면 배열을 돕는 클래스인 Arrays 의 도움을 받아야한다.
		System.out.println(arr); 
		System.out.println(Arrays.toString(arr));
		//배열의 자료를 참조하는 방법  : 배열변수[index]
		System.out.println(arr[0]+arr[1]);
		//try catch : 오류가 발생할 수 있는 지점을 예외(통례에서 벗어남)처리
		//=>오류가 발생할 수도 있기 때문에 처리되는 지역
		try {
			//**주의 
			System.out.println(arr[4]);//컴파일시 발견할 수 없는 (심각한)오류 발생(jvm, 어플 종료) 
			//ArrayIndexOutOfBoundsException : 배열에 없는 인덱스를 참조
		}catch(ArrayIndexOutOfBoundsException e) {
			//처리할 오류 만약 오류가 발생시 e에 오류 내역에 담긴다.
			System.out.println(e.getMessage());
		}
		System.out.println("종료 시 실행되지 않음");
		
		
		
		
		
		
	}
}
