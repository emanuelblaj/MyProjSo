package me.univ.pbfilozof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
;

public class FilSem {
	static int i;
	public static void main(String[] args) throws IOException {
		Reader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("n = ");
		int n = rd.read();
		new Comun(n);
		Filozof[] f = new Filozof[n];
		for(i = 0; i < n; i++) {
			f[i] = new Filozof(i);
			
		}
		for(i = 0; i < n; i++) {
			f[i].start();
		}
	}

}
