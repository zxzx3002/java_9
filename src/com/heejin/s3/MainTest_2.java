package com.heejin.s3;

import com.heejin.s2.Point;

public class MainTest_2 {
	public static void main(String [] args) {
		Point p = new Point(); //생성자가 defalut로 선언되어있으면 new Point()에서 에러가 난다. 
		//Point p 자체는 클래스가 public으로 선언되어있어 상관X 클래스가 default로 선언되어 있으면 Point p에서 에러가난다.
		
		p.name="iu";
	}
}
