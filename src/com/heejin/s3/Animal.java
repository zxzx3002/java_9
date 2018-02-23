package com.heejin.s3;

public abstract class Animal {
	
	String name;
	int age;
	
	public Animal() {
		
	}
	
	public void t() {
		this.eat();//추상메서드 호출 가능
	}
	
	public abstract void eat();//Animal클래스를 상속받으면 eat이라는 메서드를 오버라이딩해줘야 한다.
	//해당 클래스에 한개이상의 추상메소드가 있으면 추상클래스로 만들어야한다.
}
