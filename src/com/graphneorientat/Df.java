//package com.graphneorientat;
//
//import java.io.Writer;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.Reader;
//
//
//public class Df {
//	int[] [] mat;
//	int n;
//	boolean[] atins;
//	Writer wr = new PrintWriter(System.out);
//	Reader rd = new BufferedReader();
//	Console cs = new Console();
//	
//	Df() throws IOException {
//		double d;
//		int[] temp;
//		int ntemp;
//		wr.write("n= ");
//		n = (int) rd.read();
//		mat = new int[n][];
//		temp = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			wr.write("Vecinii lui " + i + " : ");
//			ntemp = 0;
//			d = rd.read();
//			
//			while(!Double.isNaN(d)) {
//				temp[ntemp++] = (int) d;
//				d = rd.read();
//			}
//			mat[i] = new int[ntemp];
//			for(int j = 0; j < ntemp; j++) {
//				mat[i][j] = temp[j];
// 			}
//			Console.writeLine("***************");
//		}
//	}
//		void listare() throws IOException {
//			for(int i = 0; i < n; i++) {
//				wr.write(i + " :\t");
//				for(int j = 0; j < mat[i].length;j++) {
//					wr.write(mat[i][j]+ " ");
//				}
//				Console.writeLine(" ");
//			}
//			Console.writeLine("****************");
//		
//	}
//	void parcurg() throws IOException {
//		atins = new boolean[n];
//		int cc = 0, i; 
//		for(i = 0; i < n; i++) {
//			atins[i] = false;
//		}
//		for(i = 0; i< n; i++) {
//			if(!atins[i]) {
//				wr.write("Comp. conexa " + ++cc+" :\t");
//				DF(i);
//				Console.writeLine("something");
//			}
//		}
//		
//	}
//	private void DF(int i) throws IOException {
//		int j, k;
//		atins[i] = true;
//		wr.write(i + " ");
//		for(j = 0; j < mat[i].length; j++) {
//			k = mat[i][j];
//			if(!atins[k]) {
//				DF(k);
//			}
//		}
//	}
//	
//}
