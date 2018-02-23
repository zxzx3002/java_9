package com.heejin.himart;

public class Customer {
	private int don;
	private int point;
	
	//물건을 여러개 계산 메서드
	public void buy(Product[] p) {
		for(int i =0; i<p.length;i++){
		don=don-p[i].getPrice();
		point=this.point+p[i].getPoint();
		}
		System.out.println("현재 남은 돈 : "+don);
		System.out.println("현재 누적포인트 : "+point);
	}
	public void buy(Product p) {
		//물건값 계산
		don=don-p.getPrice();
		point=this.point+p.getPoint();
		//포인트계산
		System.out.println("현재 남은 돈 : "+don);
		System.out.println("현재 누적포인트 : "+point);
		//instanceof 연산자 true, false
		//해당참조 변수가 어떤 클래스타입인지 판별
		if(p instanceof Tv) {
			Tv t = (Tv)p;
			System.out.println(t.getBrand());
		}else if(p instanceof Computer) {
			Computer c = (Computer)p;
			System.out.println(c.getCpu());
		}else {
			Phone phone = (Phone)p;
		}
			
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
