package com.other;

public class P2 {
	public static void main(String[] sir) throws InterruptedException {
		Tip ob = new Tip();
		ob.start();
		Thread.sleep(50);
		ob.k = 2;
		ob.join();
		System.out.println("*********");
	}
}
