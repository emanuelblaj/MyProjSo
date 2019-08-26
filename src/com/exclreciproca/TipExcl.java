package com.exclreciproca;

public class TipExcl extends Thread {
	static int total;
	int i;
	
	TipExcl(int i) {
		this.i = i;
	}
	
	void delay() {
		try {
			Thread.sleep((int) (100 * Math.random())); 
		} catch(InterruptedException e) {
			
		}
	}
	public void run() {
		int temp;
		for(int j = 1; j <= 10; j++) {
			System.out.print(" " + i);
			delay();
			temp = total;
			delay();
			temp++;
			delay();
			total = temp;
		}
	}

}
