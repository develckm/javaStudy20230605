package com.java.sudy;

public class L14IfTest2 {
	public static void main(String[]args) {
		/* 제어문 (흐름)
		 * if(boolean){
		 * 		boolean true 일때 실행되는 블럭
		 * }
		 */
		int i=10;
		//i가 양수일때만 양수야!  하고 콘솔에 출력하세요! 
		if(i>0) {			
			System.out.println(i+"는 양수야!");
		}else if(i==0){
			System.out.println(i+"는 0이야!");
		}else {			
			System.out.println(i+"는 음수야!");
		}
		
		//10%2==0 짝 
		//9%2 ==1 홀
		//0%2 ==0 ?? 0
		i=0;
		if(i!=0) {
			//홀짝
			if(i%2==0) {
				System.out.println(i+"는 짝입니다.");
			}else {
				System.out.println(i+"는 홀입니다.");
			}
		}else {
			System.out.println(i+"는 0이기 때문에 홀짝이 없다.");
		}
		
		
		/* if(boolean){
		 * 		boolean이 true 일때 실행되는 블럭
		 * }else{
		 * 		위 조건이 맞는 것이 없을 때 (boolean이 false 일때 )
		 * 		실행되는 블럭
		 * }
		 */
		
		/* if(조건1){
		 * 		조건1이 true 일때 실행되는 블럭
		 * }else if(조건2){
		 * 		조건1이 true가 아니고 조건2이 true 일때 실행되는 블럭
		 * }else if(조건3){
		 * 		조건2이 만족하지 않고 조건3이 true 일때 실행되는 블럭
		 * }else if(...){
		 * 		...
		 * }else{
		 * 		위 조건들이 모두 만족하지 않을 때 실행되는 블럭
		 * }
		 */

	}
}
