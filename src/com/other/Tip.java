package com.other;

public class Tip extends Thread {
	static int k = 2;
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.println(k+ " ");
		}
	}
	

}
