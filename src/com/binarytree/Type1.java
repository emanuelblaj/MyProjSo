package com.binarytree;

public class Type1 extends Thread {
	static int n; int i;
	public Type1(int i) {
		this.i = i;
	}
	public void run() {
		BinaryTree.a[n+1] = BinaryTree.a[i];
	}

}
