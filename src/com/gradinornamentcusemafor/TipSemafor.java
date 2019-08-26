package com.gradinornamentcusemafor;

public class TipSemafor extends Thread {
	static int total;
	int i;
	static Semafor exRec = new Semafor(1);
	
	TipSemafor(int ii) {
		i = ii;
	}
	public void run() {
		int temp;
		for(int j = 0; j < 10; j++) {
			try {
				sleep((int) (100 * Math.random()));
			}
			catch(InterruptedException e) {
				
			}
			exRec.W();
			System.out.print(i+ "\t");
			temp = total;
			temp++;
			total = temp;
			exRec.S();
		}
	}

}
