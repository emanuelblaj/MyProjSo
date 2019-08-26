package com.gradinornament;

public class Contor {

	static int total;
	synchronized void numara() {
		int temp;
		temp = total;
		temp++;
		total = temp;
	}
	
}
