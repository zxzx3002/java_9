package com.iu.s1;

public class TestMain {
	public static void main(String[] args) {
		Test t = new Test();
		int a = 10;
		int b = 20;
		t.t1('a', b);//형변환 primitive type 에서 boolean을 제외하고 서로 형변환 가능
		
		double d = 3.12;
		long l = 10L;
	
		d=l;//자동형변환
		
		l=(long)d;//강제형변환
		
		//기준 : 포함 가능 - 자동 형변환, 불가능 - 강제 형변환
		
	}
}
