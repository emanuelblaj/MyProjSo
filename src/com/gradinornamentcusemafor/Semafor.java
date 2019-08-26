package com.gradinornamentcusemafor;

public class Semafor {
	private int value = 0;
	
	public Semafor(int initial) {
		value = initial;
	}
	public synchronized void W() {
		value--;
		if(value < 0) {
			try { wait();
		} 
			catch(InterruptedException e) {
				
			}
		}

	}
	public synchronized void S() {
		value++;
		if(value <= 0) {
			notify();
		}
	}
}
