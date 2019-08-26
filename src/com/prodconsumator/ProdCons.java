package com.prodconsumator;

public class ProdCons {
	public static void main(String[] args) {
		Banda b = new Banda();
		Prod p = new Prod(b);
		Cons c = new Cons(b);
		Thread firP = new Thread(p);
		firP.start();
		Thread firC = new Thread(c);
		firC.start();
		
		try {
			firP.join();
			firC.join();
		} 
		catch (InterruptedException e) {
			
		}
	}

}
