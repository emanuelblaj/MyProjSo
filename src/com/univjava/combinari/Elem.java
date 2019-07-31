package com.univjava.combinari;

public class Elem {
	int n, k;
	Elem tata;
	static int cnk;
	
	Elem(int nn, int kk, Elem x) {
		this.n = nn;
		this.k = kk;
		this.tata = x;
	}
	
	String print() {
		if(tata == null) {
			return ("");
		} else {
			return n+1 + " " + tata.print();
		}
	}
	void p() {
		Elem x = null;
		int i;
		if(k == 0) {
			System.out.println(++cnk + "\t: "+ print());
		} else {
			for(i = k; i <= n; i++) {
				x = new Elem(i-1, k-1, this);
				x.p();
			}
		}
	}
}
