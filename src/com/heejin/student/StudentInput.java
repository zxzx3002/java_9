package com.heejin.student;

import java.util.Scanner;

public class StudentInput extends Student{
	//addStudent 메서드 
	//학생 1명을 만들어서 리턴
	public Student addStudent() {
		
		Student s = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력");
		s.setName(sc.next());
		System.out.println("번호입력");
		s.setNum(sc.next());
		System.out.println("수학점수입력");
		s.setMath(sc.nextInt());
		System.out.println("국어점수입력");
		s.setKor(sc.nextInt());
		System.out.println("영어점수입력");
		s.setKor(sc.nextInt());
		
		s.setTotal(s.getKor()+s.getMath()+s.getEng());
		s.setAvg(s.getTotal()/3.0);
		
		return s;
		
	}
}
