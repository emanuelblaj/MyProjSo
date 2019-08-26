package com.exclreciproca;

public class Grad_Rau {
	public static void main(String[] args) {
		TipExcl[] ob = new TipExcl[5];
		for(int i = 0; i<5; i++) {
			ob[i] = new TipExcl(i);
		}
		for(int i = 0; i<5; i++) {
			ob[i].start();
		}
		
		try {
			for(int i = 4; i>=0; i--) {
				ob[i].join();
			}
		}
		catch(InterruptedException e) {
		}
		System.out.println();
		System.out.println("Total = " + TipExcl.total);
	}

}
