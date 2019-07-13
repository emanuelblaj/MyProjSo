package com.monotonic.generics._7_reflection.b_reflecting_types;

import java.util.List;
import java.util.ArrayList;

public class NonReifiableExamples<T> {
	public static void main(String[] args) {
		new NonReifiableExamples<String>().main();	
	}
	
	private void main() {
		List<String> strings = new ArrayList<>();
		List<Integer> integers = new ArrayList<>();
		System.out.println(strings.getClass());
		System.out.println(integers.getClass());
		System.out.println(integers.getClass() == strings.getClass());
		
		List<? extends Number> numbers = new ArrayList<>();
		System.out.println(numbers.getClass());
		System.out.println(integers.getClass() == numbers.getClass());
	}

}
