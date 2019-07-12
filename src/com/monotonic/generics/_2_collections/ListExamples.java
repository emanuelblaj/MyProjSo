package com.monotonic.generics._2_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
	public static void main(String[] args) {
		Person donDraper = new Person("Don Draper", 89);
		Person peggyOlson = new Person("Peggy Olson", 65);
		
		List<Person> madMen = new ArrayList<Person>();
		madMen.add(donDraper);
		madMen.add(peggyOlson);
		
		System.out.println(madMen);
		
		madMen.add(new Person("Bert Cooper", 100));
		
		final Iterator<Person> iterator = madMen.iterator();
		while(iterator.hasNext()) {
			final Person person = iterator.next();
			System.out.println(person);
		}		
	}
}
