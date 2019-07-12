package com.monotonic.generics._2_collections;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
	public static void main(String[] args) {
	Person donDraper = new Person("Don Draper", 89);
	Person peggyOlson = new Person("Peggy Olson", 65);
	Person bertCooper = new Person("Bert Cooper", 100);
	
	Set<Person> madMen = new HashSet<>();
	madMen.add(donDraper);
	madMen.add(peggyOlson);
	madMen.add(donDraper);
	
	System.out.println(madMen.contains(donDraper));
	System.out.println(madMen.contains(bertCooper));
	
	for(Person person : madMen) {
		System.out.println(person);
	}
	}
}
