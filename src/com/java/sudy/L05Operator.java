package com.java.sudy;

import java.util.Arrays;

public class L05Operator {
	public static void main(String [] args) {
		/* 
		 * 수학의 연산자
		 * + - 		(부호 양수 음수)
		 * ++ -- 	(증감)
		 * * / % 	(산수연산1)
		 * + -		(산수연산2)
		 * >> <<	(시프트 : 비트를 움직이는 것)
		 * & | ^ ~  (비트연산 : 비트의 곱이나 합연)
		 * 비교연산
		 * > < >= <=	(비교)
		 * ==,!=		(동등)
		 * +=,-=,*=,/=,%= (복잡한 대입)
		 * =			(대입,참조연산)
		 * 논리연산
		 * &&(교집합), ||(합), !(차)
		 * */
		int a=+10; //+부호는 생략 가능
		a=-a;
		System.out.println(a);
		a=10+a;
		System.out.println(a);
		a=(a+2)*(a+2);
		System.out.println(a);
		a=5/2; //자바는 정서를 연산하면 무조건 정수만 반환
		System.out.println(a);
		double d=5/2; //자바는 정서를 연산하면 무조건 정수만 반환
		System.out.println(d);
		//**자바의 연산은 하나라도 실수여야 실수 연산(소수점이하 연산)을 한다.
		d=5.0/2;
		System.out.println(d);

		a=8%3;
		System.out.println(a);
		a=3-9;
		System.out.println(a);
		
		a=1;
		System.out.println(++a);
		a=a+1; //== ++a
		System.out.println(a);
		// a++  ++의 다음 연산을 하고 증가
		System.out.println(a++); //연산을 미룬다
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);

		int b=5; //대입
		b+=9;//더하기 대입 == b=b+9
		System.out.println(b);
		b-=1;
		System.out.println(b);
		--b;
		System.out.println(b);
		b*=4;
		System.out.println(b);
		b/=5;
		System.out.println(b);
		b%=2;
		System.out.println(b);

		System.out.println(b<<4);
		// 1 0 0 0  << 1 => 0 1 0 0
		// 1 0 1 0  << 1 => 0 1 0 1
		System.out.println(5<<1);
		// & 비트연산의 곱
		// 1 & 1 => 1
		// 0 & 1 => 0
		// 0 & 0 => 0
		// | 비트연산의 합
		// 1 | 1 => 1
		// 1 | 0 => 1
		// 0 | 0 => 0
		// 1001(9) & 0110(6) = 0000
		// 1001(9) | 0110(6) = 1111
		// 1101(11) | 0100(2) = 1101
		// 1101(11) & 0100(2) = 0100
		System.out.println(9 & 6);
		System.out.println(9 | 6);
		System.out.println(11 | 2);
		System.out.println(11 & 2);

		//13 | 6 => 1011 | 0110 -> 1111
		//13 & 6 => 1011 & 0110 -> 0010
		//9 >> 2  1001 0000 => 0100 0000
		System.out.println(9>>2);
		//9 << 2  1001 0000 => 0010 0100
		System.out.println(9<<2);
		char [] test=  {'안','녕','하','세','요'};
		new String(test);
		int [] test2= {3,7,8,-1};
		System.out.println(test2);
		System.out.println(Arrays.toString(test2));
	}
}
