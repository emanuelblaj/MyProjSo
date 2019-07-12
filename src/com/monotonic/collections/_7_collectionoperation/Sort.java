package com.monotonic.collections._7_collectionoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.monotonic.collections.Product;
import com.monotonic.collections.ProductFixtures;

public class Sort {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(ProductFixtures.door);
		products.add(ProductFixtures.floorPanel);
		products.add(ProductFixtures.window);
		
		System.out.println(products);
		
		products.sort( Product.BY_NAME);
		System.out.println(products);
		
		products.sort(Product.BY_WEIGHT);
		System.out.println(products);
	}
}
