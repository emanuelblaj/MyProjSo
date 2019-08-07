package com.stiva;

public class SVectorex {
	int lung, ns;
	char [] stack;
	SVectorex(int lung) {
		this.lung = lung;
		stack = new char[lung];
	}
	void pune(char c) throws Plina {
		if(ns == lung) throw new Plina();
		else {
			System.out.print(" P" + c);
			stack[ns] = c; 
			ns++;
		}
	}
	char ia() throws Vida {
		if(ns == 0) throw new Vida();
		else {
			System.out.print(" I" + stack[--ns]);
			return stack[ns];
		}
	}
}
