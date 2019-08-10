package com.arraysclass;

import java.util.Arrays;

public class ComparMain {
	public static void main(String[] s) {
		Elem[] tab = {new Elem(1, 2), new Elem(3,1), new Elem(1, 1)
	};
		Comp c = new Comp();
		Arrays.sort(tab, c);
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].x + " " + tab[i].y);
		}
	}

}
