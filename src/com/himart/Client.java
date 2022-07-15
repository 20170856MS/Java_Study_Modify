package com.himart;

import com.main.Main;

public class Client {
	
	private int money;
	private int point;
	
	public Client() {
		this.money=30000000;
		this.setPoint(10);
	}
	
	
	Main main = new Main();
	public void buy(Tv tv) {
		this.money=this.money-tv.getPrice();
		this.point=this.point+tv.getPoint();
		System.out.println("잔액 : "+this.money);
		System.out.println("포인트 : "+this.point);
	}
	public void buy(Computer com) {
		this.money=this.money-com.getPrice();
		this.point=this.point+com.getPoint();
		System.out.println("잔액 : "+this.money);
		System.out.println("포인트 : "+this.point);
	}
	public void buy(Phone phone) {
		this.money=this.money-phone.getPrice();
		this.point=this.point+phone.getPoint();
		System.out.println("잔액 : "+this.money);
		System.out.println("포인트 : "+this.point);
	}
	
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
