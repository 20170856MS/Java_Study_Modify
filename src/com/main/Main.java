package com.main;

import java.util.Scanner;

import com.himart.Client;
import com.himart.Computer;
import com.himart.Phone;
import com.himart.Tv;




public class Main {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		Tv tv = new Tv();
		Phone phone = new Phone();
		
		com.info();
		tv.info();
		phone.info();
		
		Client cl = new Client();
		
		cl.buy(phone);

		
	}

}
