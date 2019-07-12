package com.monotonic.collections._7_collectionoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.monotonic.collections.Product;
import com.monotonic.collections.ProductFixtures;

public class Rotate {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(ProductFixtures.door);
		products.add(ProductFixtures.floorPanel);
		products.add(ProductFixtures.window);
		
		System.out.println(products);
		System.out.println();
		
		Collections.rotate(products, 1);
		System.out.println(products);
		System.out.println();
		
		Collections.rotate(products, 1);
		System.out.println(products);
		System.out.println();
		
		Collections.rotate(products, 1);
		System.out.println(products);
		
	}

}
