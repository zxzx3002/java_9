package com.heejin.s1;

public class Member {
	int age;
	private String name;
	private int age;
	private String sex;
	private double weight;
	private double height;
	private String phone;
	public void getName(String name) {
		this.name=name;
	}
	public String setName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+sex);
		System.out.println("몸무게 : "+weight);
		System.out.println("키 : "+height);
		System.out.println("전화번호 : "+phone);
	}
}
