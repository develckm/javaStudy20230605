package com.java.sudy;
//비교연산
public class L06ComparisonOperator {
	public static void main(String []args) {
		//수학연산 => 수 (기본형)
		//비교연산 => 수 (기본형)
		//동등비교연산(==) => 수(기본형은 값이 같은지), 자료형(주소같은지==두객체가 완전히 같은지)
		//자료형의 모든 필드가 같은지 검사하는 것 Object.equals()
		int a=10;
		int b=10;
		System.out.println(a==b); //a b 를 수학적으로 같은지 비교 
		String s="안녕";
		String s2="안녕";
		System.out.println(s==s2); //"안녕"과 "안녕"이 완전 같은 객체인지
		char[] arr= {'안','녕'};
		char[] arr2= {'안','녕'};
		System.out.println(arr==arr2); //자료형은 동등비교 해서는 안된다. 
		//자료형은 생성시 무조건 다른 객체를 만든다 (문자열을 제외하고)

		s=new String("안녕");
		s2=new String("안녕");
		//문자열은 리터럴하게 선언하면 새로운 문자열을 만들지않고 
		//메모리에 동일한 문자열이 있는지 찾아서 참조함 (문자열을 엄청 많이 써서 )
		System.out.println(s+"/"+s2);
		System.out.println(s==s2);
		
		//자료형은 자료형이 포함하는 모든 필드의 값이 같은지 비교하는 방법이 있나요??
		//Object.equlas();
		System.out.println(s.equals(s2)); //자료형의 비교방법
		
		//System.out.println(s>s2); //컴파일 오류(문법)
		System.out.println(10>3);
		System.out.println(10>=10);
		System.out.println(10<10);
		System.out.println(10<=10);
		int c=10;
		System.out.println(c!=10);
		System.out.println(c==10);
		int d=7;
		//&& == AND 연산, 교집합
		System.out.println(d>5 && d<10); //5보다 크고 10보다 작은것
		int e=30; //(20~30 33, 15)
		//e가 20과 같거나 크고 30과 같거나 작다는 것을 확인 (20이상 30이하)
		System.out.println(e>=20 && e<=30);
		//|| == OR 연산, 합집합
		//0보다 작거나 100보다 큰것 =>true 
		int f=120;
		System.out.println( (f<0 || f>100)?"다시입력":"입력됨");
		//! == NOT 연산, 차집합 , false  인지
		
		System.out.println(!(false));
		System.out.println(!(1>2));
		int g=88;
		//0~100 까지인지 확인
		System.out.println(!(g<0||g>100));

	}
}
