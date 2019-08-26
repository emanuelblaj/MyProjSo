package me.univ.pbfilozof;

public class Filozof extends Thread {
	int i;
	Filozof (int i) {
		i = i;
	}
	
	public void run() {
		for(int j = 0; j < 10; j++) {
			try {
			sleep((int) ( 100 * Math.random()));
			}
			catch (InterruptedException e) {
			}
		Comun.scaunLiber.W();
		Comun.b[i].W();
		Comun.b[(i+1)& Comun.n].W();
		System.out.print(" M" +i);
		try {
			sleep((int) (100 * Math.random()));
		}
		catch(InterruptedException e) {
			
		}
		System.out.print(" G" + i);
		Comun.b[i].S();
		Comun.b[(i+1) & Comun.n].S();
		Comun.scaunLiber.S();
		}
	}
}
