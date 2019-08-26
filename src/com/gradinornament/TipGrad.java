package com.gradinornament;

public class TipGrad extends Thread {
	int i ;
	static Contor c;
	
	TipGrad(int i) {
		this.i = i;
	}
	public void tun() {
		for(int j = 0; j<10; j++) {
			c.numara();
			System.out.print(" " + i);
		}
	}
}
