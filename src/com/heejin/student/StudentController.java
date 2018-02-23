package com.heejin.student;

import java.util.Scanner;

public class StudentController {
	private Scanner sc;
	public StudentController() {
		sc=new Scanner(System.in);
	}
	public void start() {
		boolean check = true;
		while(check) {
			System.out.println("1.학생 추가");
			System.out.println("2.학생 정보 출력");
			System.out.println("3.프로그램 종료");
		}
	}
}
