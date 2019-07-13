package com.monotonic.generics._4_methods;

import java.util.Comparator;

import com.monotonic.generics._2_collections.Person;

public class AgeComparator implements Comparator<Person> {
	public int compare(final Person left, final Person right) {
		return -1 * Integer.compare(left.getAge(), right.getAge());
	}
}
