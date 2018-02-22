package com.heejin.s1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Member member = new Member();
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		member.height=sc.nextInt();
		System.out.println("몸무게를 입력하세요");
		member.weight=sc.nextInt();
		member.info();
		Inbody inbody = new Inbody();
		inbody.check(member);
	}
}
