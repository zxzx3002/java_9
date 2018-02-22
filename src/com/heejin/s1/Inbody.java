package com.heejin.s1;

import java.util.Scanner;

public class Inbody {
	public void check(Member member) {
		/*System.out.println("이름을 입력하세요");
		mb.name=sc.next();
		System.out.println("나이를 입력하세요");
		mb.age=sc.nextInt();
		System.out.println("성별을 입력하세요");
		mb.sex=sc.next();
		System.out.println("전화번호를 입력하세요");
		mb.phone=sc.next();*/
		
		double a = (member.height - 100) *0.95;
		if(a<member.weight) {
			System.out.println("비만입니다");
		} else if(a>member.weight) {
			System.out.println("저체중입니다");
		} else if(a==member.weight) {
			System.out.println("정상체중입니다.");
		}
		
	}
}
