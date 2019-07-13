package com.monotonic.generics._6_compatibility.c_implications_of_erasure;

public class InstanceOfExample /*<T>*/ {
	public boolean equals(Object o) {
		if(o instanceof InstanceOfExample/*<T>*/) {
			return true;
		} 
		return false;
	} 
}
