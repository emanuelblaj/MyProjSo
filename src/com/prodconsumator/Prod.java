package com.prodconsumator;

public class Prod implements Runnable {
	Banda b;
	Prod(Banda bb) {
		b = bb;
	}
	
	public void run() {
		char ch;
		for(ch = 'a'; ch <= 'z'; ch++) {
			b.pune(ch);
			try {
				Thread.sleep(Banda.obT.delay());
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
