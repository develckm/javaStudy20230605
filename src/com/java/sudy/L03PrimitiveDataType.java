package com.java.sudy;

public class L03PrimitiveDataType {
	public static void main(String [] args) {
		//정수형 long 
		long l=5555555;
		//실수 
		double d=3.14123123123123123123123123231;
		System.out.println(d);
		float f=3.14123123123123123123123123231f;
		System.out.println(f);
		d=314123123123123123123123123231314123123123123123123123123231314123123123123123123123123233141231231231231231231231232314123123123123123123123314123123123123123123123131412312312312312331412312312312331412312312312312312331412312312312312312312312323112312323112312312312323112312312323123231123231311.0*-314123123123123123123123123231.0;
		System.out.println(d);
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(Float.MAX_EXPONENT);
		//108 == 1.08 * 10^2
		//41234.7== 4.12347 * 10^-4
		//14123123123123123123123123231 => long ??
		//1.412312312312300000000000000*10^28
		double test=1.2-1.1;
		System.out.println(test);
		System.out.println(test==0.1);
		//실수 연산의 부정확함
	}
}