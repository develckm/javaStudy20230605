package com.java.sudy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class L16While {

	public static void main(String[] args) throws InterruptedException {
		//현관문 조명 
		//->센서(반복문)
		
		//반복문 : 연속되는 데이터를 반복 처리하기 위해 존재
		//어플리케이션을 계속 실행하기 위해 존재 
		/*while(조건){
		 *	 조건이 true 일 반복 실행되는 지역(scope)
		 *	 조건이 false 가 되어야 반복 실행에서 벗어날 수 있다.
		 *}
		 * */
		//디지털 시계 (무한히 일 1초에 한번만)
		java.util.Date now=new Date();
		System.out.println(now);//toString()이 생락  : 객체 설명서
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());//현제 지역(os)에 맞는 문자열 시간(ko-kr)
		System.out.println(System.currentTimeMillis());
		//1970 01 01 0:00 이때 부터 밀리초의 시간이 흐르는 것 (1970년 이전을 저장할 때는 문자열로 저장)
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MM_dd hh:mm:ss a");
		while(true) {
			Thread.sleep(1000);
			System.out.println(sdf.format(new Date()));
		}
		//** thread 실행단위 
		//main  함수가 thread  한개를 가진다.
		//-> main 함수는 한번에 한개의 코드를 실행할 수 있다.(순차전 언어->코드가 순서대로 실행)
		//멀티스레드 -> 일을 thread 수만큼 동시에 할 수 있다. (자바는 멀티스레드를 생성할 수 있다. 후반)
		//Thread.sleep(1000); : 일을 해당 밀리초만큼 쉬는 것 
		
		//프로세스 vs Thread 
		//프로세스 : cpu가 일을 하는 단위 
		//Thread : 어플리케이션(jvm) 안에서 일을 하는 단위
		
		
	}

}
