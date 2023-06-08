package com.java.sudy;

import java.util.Arrays;

public class L19Array2 {
	public static void main(String[] args) {
		int [] arr= {77,88,99,111};
		System.out.println(new int[] {77,88,99,111}==arr); //변수 없이 리터럴하게 선언
		//자료형==자료형 : 두 자료가 실은 같은 건지
		//equals : 자료의 모든 값이 같은지 비교
		System.out.println(Arrays.equals(arr, new int[] {77,88,99,111}));
		//대학교 성적
		int [] scores= {99,88,95,76,100,50};
		//평균
		int avg=(scores[0]+scores[1]+scores[2]+scores[3]+scores[4]+scores[5])/scores.length;
		System.out.println("대학교 성적의 평균 :"+avg);
		System.out.println("성적 배열의 길이 :"+scores.length);
		
		int i=0;//i==index
		int sum=0; //모든 값을 더할 변수
		while(i<scores.length) {
			sum=sum+scores[i++];
			System.out.println("합 :"+sum+"/ i:"+i);
		}
		//배열을 탐색하는 반복문의 공식 
		//선언문 int i=0;
		//조건문 i<array.lenth
		//증감문 i++;
		System.out.println("성적 평균 :"+(sum/scores.length));
		//for : 선언문,조건문,증감문을 합쳐 놓은 것 (배열을 탐색하기 위해 존재)
		//for(int i=0; i<array.length; i++){
		//}
		
		sum=0;
		for(int j=0; j<scores.length; j++) {
			sum+=scores[j];
		}
		System.out.println("성적 평균 :"+(sum/scores.length));

		
	}
}
