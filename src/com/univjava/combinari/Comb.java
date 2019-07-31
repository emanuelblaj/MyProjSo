package com.univjava.combinari;

import java.util.Scanner;

public class Comb {
	public static void main(String[] args) {
		System.out.print("n, k = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Elem prim = new Elem(n, k, null);
		prim.p();
		System.out.println("n= " + n + " k= " + k + " cnk= " + Elem.cnk);
	}
}
