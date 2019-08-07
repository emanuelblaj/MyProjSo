package com.stiva;

import java.util.Random;

public class StivaEx {
	public static void main(String[] args) {
		int n = 10;
		int na;
		int nb;
		int i;
		char[] a,b;
		char c;
		a = new char[n];
		b = new char[n];
		Random r = new Random();
		System.out.println(r.nextInt());
		for(c = 'a', i = 0; i < n; i ++, c++) {
			a[i] = c;
			na = 0;
			nb = 0;
			SVectorex ob = new SVectorex(3);
		
		while(nb != n ) {
			try {
				if(r.nextInt() < 0 && na < n) {
					ob.pune(a[na]);
					na++;
					
				}
				else {
					b[nb] = ob.ia();
					nb++;
				}
			}
			catch(Vida e) {
				e.print(" ~I");
			}
			catch (Plina e) {
				e.print(" ~P");
			}
			System.out.println();
			for (i = 0; i < n; i++) {
				System.out.print(b[i] + " ");
				System.out.println();
			}
		}
	}
	}
}
