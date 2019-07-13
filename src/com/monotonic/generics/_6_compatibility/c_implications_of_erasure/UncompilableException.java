package com.monotonic.generics._6_compatibility.c_implications_of_erasure;

public class UncompilableException extends Exception {
	public static void main(String[] args) {
		try {
			throw new UncompilableException();
		} 
		catch(UncompilableException e) {
			e.printStackTrace();
		}
	}

}
