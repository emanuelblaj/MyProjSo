package com.prodconsumator;

public class Cons implements Runnable {
	Banda b ;
	Cons(Banda bb) {
		b = bb;
	}
	public void run() {
		char ch;
		do {
			ch = b.ia();
			try {
				Thread.sleep(Banda.obT.delay());
			}
			catch(InterruptedException e) {
				
			}
		} while(ch != 'z');
	}

}
