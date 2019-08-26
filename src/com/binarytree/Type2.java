package com.binarytree;

public class Type2 extends Thread {
	int i;
	public Type2(int i) {
		this.i = i;
	}
	public void run() {
		BinaryTree.a[i] = BinaryTree.a[2*i] + BinaryTree.a[2*i+1];
	}

}
