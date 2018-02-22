package com.heejin.himart;

public class Customer {
	private int don;
	private int point;
	public void buy(int price, int point) {
		//물건값 계산
		don=don-price;
		this.point=this.point+point;
		//포인트계산
		System.out.println("현재 남은 돈 : "+don);
		System.out.println("현재 누적포인트 : "+point);
		
		
	}
	public int getDon() {
		return don;
	}
	public void setDon(int don) {
		this.don = don;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
