package com.stiva;

public class Stiva implements Cloneable {
	private int[]v;
	private int top;

	@Override
	protected Stiva clone() throws CloneNotSupportedException  {
		try {
			Stiva obNew = (Stiva)clone();
//			obNew.v = (int[]) v.clone();
			return obNew;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	Stiva (int nrmax) {
		v = new int[nrmax];
		top = -1;
	}
	void push(int val) {
		v[++top] = val;
	}
	int pop() {
		return v[top--];
	}
	void scrie() {
		for(int i = 0; i <= top; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}

}
