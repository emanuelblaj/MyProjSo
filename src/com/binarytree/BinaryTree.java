package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BinaryTree {
	static int[] a = new int[32];
	static int n;
	
	public static void main(String[] args) throws IOException {
		int m = 0, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("m= ");
		m = (int) br.read();
		int n = 1;
		for(i = 0; i < m; i++) {
			n *=2;
		}
		System.out.print("Numerele : ");
		for(i = 0; i < n; i++) {
			a[i] = (int) br.read();
		}
//		-----------------------------------------------
		
		Type1[] ob1 = new Type1[n];
		Type1.n = n;
		for(i = 0; i < n; i++) {
			ob1[i] = new Type1(i);
		}
		for(i = 0; i < n; i++) {
			ob1[i].start();
		}
		try {
			for(i = 0; i < n; i++) {
				ob1[i].join();
			}
		} catch(InterruptedException e) {
			
		}
//		-----------------------------------------------
				
		Type2[] ob2 = new Type2[n];
		int p = n/2;
		int u = n;
		for(int k = m-1;k >= 0;k--) {
			for(i = p; i < u; i++) {
				ob2[i] = new Type2(i);
			}
			for(i = p; i < u; i++) {
				ob2[i].start();
			}
			try {
				for(i = p; i < u; i++) {
					ob2[i].join();
				}
			} catch (InterruptedException e) {
				
			}
			for(i = p; i < u; i++) 
				System.out.print(a[i] + " ");
			System.out.println();
			p = p/2;
			u = u/2;
		}
		System.out.println("Suma = " + a[1]);
	}
}
