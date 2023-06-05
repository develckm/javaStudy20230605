package com.java.sudy;

public class L10Switch {
	public static void main(String[]args) {
		//스위치의 조건은 정수형, 문자열, 열거형 을 사용할 수 있다
		//Cannot switch on a value of type double. 
		//Only convertible int values, strings or enum variables are permitted
		int a=2;
		if(a==1) {
			System.out.println("첫번째");
		}else if(a==2) {
			System.out.println("두번째");
		}else if(a==3) {
			System.out.println("세번째");
		}else {
			System.out.println("1~3이 아님");
		}
		//if else  조건을 파악하기 어렵다
		//switch 는 조건을 파악하기 좋다.
		//if문 보다 (비교)연산속도 빠르다. 
		//**단점 복잡한 조건을 사용할 수 없다.
		//**java switch 의 조건으로 정수,문자열,열거형만 사용가능
		switch(a) {
			case 1:
				System.out.println("첫번째");break;
			case 2:
				System.out.println("두번째");break;
			case 3:
				System.out.println("세번째");break;
			default :
				System.out.println("1~3 이 아님");break;
		}
		
		int month=6;
		String monthStr="";		
		switch(month) {
			case 1:
				monthStr="Jan"; break;
			case 2:
				monthStr="Feb"; break;
			case 3:
				monthStr="Mar"; break;
			case 4:
				monthStr="Apr"; break;
			case 5:
				monthStr="May"; break;
			case 6:
				monthStr="Jun"; break;
			case 7:
				monthStr="Jul"; break;
			case 8:
				monthStr="Aug"; break;
			case 9:
				monthStr="Sep"; break;
			case 10:
				monthStr="Oct"; break;
			case 11:
				monthStr="Nov"; break;
			case 12:
				monthStr="Dec"; break;
			default:
				monthStr="1~12까지 수만 입력"; break;
				
		}
		System.out.println("이번 달은 "+monthStr+" 입니다.");

		//**index가 있는 switch 는 배열로 대체가능
		//**문자열로 조건을 사용하는 switch 는 Map으로 대체 가능(**)
//		String []monthArr= new String [12];
//		//{null,null .... null}
//		//인덱스 : 순서가 있는 데이터
//		//길이 : 데이터의 길이
//		monthArr[0]="Jan";
//		monthArr[1]="Feb";
//		monthArr[2]="Mar";
//		monthArr[3]="Apr";
//		monthArr[4]="May";
//		monthArr[5]="Jun";
//		monthArr[6]="Jul";
//		monthArr[7]="Aug";
//		monthArr[8]="Sep";
//		monthArr[9]="Oct";
//		monthArr[10]="Nov";
//		monthArr[11]="Dec";
		String [] monthArr= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.println("이번 달은 "+monthArr[month-1]+" 입니다.");

	}
}
