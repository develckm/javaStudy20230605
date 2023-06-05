package com.java.sudy;
//고등학생 자료 (학년,반,이름,번호,성별,....)
//Student 자료형 (필드)
//기본형은 필드가 없다! 오지 수만 갖는다. (원시형 기본형)
class Student{
	//전역변수 -> 속성,필드
	int grade=1;
	int gradeClass=5; 
	String name="홍길동";
	int num=31;
	boolean gender=false;//true:여자,false:남자
	public Student() {}
	//(~~~~)매개변수
	public Student(int g,int c, String n, int num,boolean gender) {
	//지역변수와 전역변수가 같은 이름이면 지역변수가 우선
	//전역변수를 지역에서 참조하는 방법 this (==객체 자신)
		this.grade=g;
		this.gradeClass=c;
		name=n;
		this.num=num;
		this.gender=gender;
	}

	
	
	
	
	//변수명 규칙
	//1.소문자로 시작 
	//2.카멜(낙타)표기법 
	//3.숫자로 시작할 수 없다.
	//4.예약어를 사용할 수 없다. 
}
//자료형
public class L04ReferenceDataType {
	public static void main(String[]args) {
		Student a=new Student(); //자료형 data
		a.name="김삼순";
		a.gender=true;
		String gender=(a.gender)?"여자":"남자"; //3항연산자
		System.out.println("a 의 이름 :"+a.name);
		System.out.println("a 의 성별 :"+gender);
		System.out.println("a 의 학년 :"+a.grade);
		System.out.println("a 의 반 :"+a.gradeClass);
		
		Student b=new Student(3, 2, "김정선", 5,false);
		gender=(b.gender)?"여자":"남자"; //3항연산자
		System.out.println("b 의 이름 :"+b.name);
		System.out.println("b 의 성별 :"+gender);
		System.out.println("b 의 학년 :"+b.grade);
		System.out.println("b 의 반 :"+b.gradeClass);
		System.out.println("b 의 번호 :"+b.num);
		
		//배열! (순서(index)와 길이(length)가 있는 자료형!)
		//자료를 순서대로 관리하기 위해 존재 
		//배열 자료형은 [] 숫자로 필드를 접근 (클래스 자료형은 . 변수명으로 필드 접근)
		int[] arr=new int[4]; //정상 표기법 (new + 배열타입 + 길이)
		System.out.println(arr[0]); //{0,0,0,0}
		arr[0]=33;
		arr[1]=55;
		arr[2]=77;
		arr[3]=88;
		System.out.println(arr[0]);	
		System.out.println(arr[1]);	
		System.out.println(arr[2]);	
		System.out.println(arr[3]);	
		System.out.println(arr.length);
		//*** 리터럴 : 보이는 것이 값이다.
		//자바의 기본형은 무조건 리터럴하게 표기 
		//자료형 중에 리터럴하게 표기하는 것이 존재 배열, 문자열
		
		
		int []arr2= {10,9,8,7,6}; //배열의 리터럴 표기법
		//문자열(문자 배열) String 이 메모리에 저장하는 방식 
		char [] arr3= new char[6];
		arr3[0]='안';
		arr3[1]='녕';
		arr3[2]='하';
		arr3[3]='세';
		arr3[4]='요';
		arr3[5]='!';
		String s=null; //자료형의 없음
		s="안녕하세요!";
		//기본형에서 없다 == 0
		//자료형에서 없다 == ??
		byte [] arr4=null;
		
		String [] arr5 =new String[5];//{null,null,null,null,null}
		System.out.println(arr5[0]);
	}
}



