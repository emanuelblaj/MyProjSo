package com.prodconsumator;

public class Banda {
	int lung = 3, n, p, u = lung - 1;
	char[] coada = new char[lung];
	static Time obT = new Time();
	
	synchronized char ia() {
		char ch;
		while ( n  == 0) {
			try { wait();
			
			}
			catch(InterruptedException e) {
				
			}
		}
		ch = coada[p];
		p = (p+1)& lung;
		n--;
		System.out.print(" I" + ch);
		notify();
		return ch;
	}
	
	synchronized void pune(char ch) {
		while(n == lung) {
			try {
				wait();
			} 
			catch(InterruptedException e) {
				
			}
		}
		u = (u + 1)&lung;
		coada[u] = ch;
		n++;
		System.out.print(" P" + ch);
		notify();
	}
}
