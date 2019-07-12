package com.monotonic.collections;

import java.util.Comparator;
import static java.util.Comparator.comparing;

public class Product {

	public static final Comparator<Product> BY_NAME = comparing(Product::getName);
	public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);
//	public static final Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
//		public int compare(final Product p1, final Product p2) {
//			return Integer.compare(p1.getWeight(), p2.getWeight());
//		}
//	};
	private final int id;
	private final String name;
	private final int weight;
	
	public Product(int id, String name, final int weight) {
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product { " +
				"id = '" + id + '\'' +
				"name ='" + name + '\'' +
				"weight=" + weight +
				'}';
	}
}
