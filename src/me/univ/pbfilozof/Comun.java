package me.univ.pbfilozof;

import com.gradinornamentcusemafor.Semafor;

public class Comun {
	static Semafor[] b;
	static Semafor scaunLiber;
	static int n;
	
	Comun(int n) {
		this.n = n;
		scaunLiber = new Semafor(n-1);
		b = new Semafor[n];
		for(int i = 0; i < n; i++) {
			b[i] = new Semafor(1);
		}
	}

}
