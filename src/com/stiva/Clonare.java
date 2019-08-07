package com.stiva;

public class Clonare {
	public static void main(String[] s) throws CloneNotSupportedException {
		Stiva s1 = new Stiva(10);
		s1.push(1);
		s1.push(3);
		s1.push(5);
		s1.push(7);
		
		Stiva s2 = s1.clone();
		s2.pop();
		s2.pop();
		s2.push(13);
		s1.scrie();
		s2.scrie();
	}

}
