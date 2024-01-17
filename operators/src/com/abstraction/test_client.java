package com.abstraction;

public class test_client {

	public static void main(String[] args) {
		human h = new man();
		h.eat();
		h.run();
		h.speak();
		
		h = new woman();
		h.eat();
		h.run();
		h.speak();
		

	}

}
