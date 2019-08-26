package com.gradinornament;

public class Grad_Bun_Orn {
	public static void main(String[] args) {
		Contor c = new Contor();
		TipGrad[] ob = new TipGrad[5];
		for(int i = 0; i<5; i++) {
			ob[i] = new TipGrad(i);
		}
		for(int i = 0; i<5; i++) {
			ob[i].start();
		}
		try {
			for(int i = 4; i >= 0; i--) {
				ob[i].join();
			}
		} 
		catch(InterruptedException e) {
			
		}
		System.out.println();
		System.out.println("Total = " + c.total);
	}
}
