package com.gradinornamentcusemafor;

public class Grand_Sem {
	public static void main(String[] args) {
		TipSemafor[] ob = new TipSemafor[5];
		for(int i = 0; i < 5; i++) {
			ob[i] = new TipSemafor(i);
			
		}
		for(int i = 0; i < 5; i++) {
			ob[i].start();
		}
		try {
			for(int  i = 0; i < 5; i++) {
				ob[i].join();
			}
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("\nTotal= " + TipSemafor.total);
	} 

}
